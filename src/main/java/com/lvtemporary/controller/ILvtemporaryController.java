package com.lvtemporary.controller;

import com.lvtemporary.entity.Lvtemporary;
import com.lvtemporary.entity.LvtemporaryExample;
import com.lvtemporary.service.ILvtemporaryService;
import org.postgresql.copy.CopyManager;
import org.postgresql.core.BaseConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@RestController
@RequestMapping("lvt")
@Component
public class ILvtemporaryController {
    private Logger logger = LoggerFactory.getLogger(ILvtemporaryController.class);
    @Value("${file.path}")
    private String filePath;
    @Value("${delay}")
    private int delay;
    @Value("${intevalPeriod}")
    private int intevalPeriod;

    @Autowired
    private ILvtemporaryService service;

    //    @RequestMapping("/add")
    @Scheduled(cron = "0/20 * * * * *")
    public void add() throws Exception {
//      ExcelToList.excelToList2("C:\\\\Users\\\\cheng\\\\Desktop\\\\test.xlsx");
        List<Lvtemporary> listServer = service.showServer(new LvtemporaryExample());
        List<Lvtemporary> listPGSql = service.showPGSql(new LvtemporaryExample());
        for (int i = 0; i < listServer.size(); i++) {
            for (int j = 0; j < listPGSql.size(); j++) {
                if (listServer.get(i).getId() == listPGSql.get(j).getId()) {
                    service.add(listServer.get(i));
                    System.err.println(listServer.get(i).getId() + "=" + listPGSql.get(j).getId() + "匹配增加！！！！");
                }
            }
        }
    }

        /*if(list!=null){
            System.err.println("正在替换模板！");
            test();
        }*/

    public int SelectIdMax() {
        List<Lvtemporary> list = service.showPGSql(new LvtemporaryExample());
        int max = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            int b = list.get(i).getId().intValue();
            int c = list.get(i + 1).getId().intValue();
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (b > c) {
                    int temp = b;
                    b = c;
                    c = temp;
                }
            }
            max = c;
        }
        System.out.println(max);
        return max;
    }

    //定时
    @RequestMapping("/time")
    void time() throws IOException {
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                try {
//                    System.err.println("执行add方法！！！！！！");
                    copyFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(task, delay, intevalPeriod);
    }

    //    @RequestMapping("/copyFile")
//    @Scheduled(cron = "0/20 * * * * *")
    String copyFile() throws Exception {
        /*File file = new File(filePath);
        file.delete();

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入指定文件夹路径：");
        String oldpath = "D:\\";
//        System.out.println("请输入目标文件夹路径：");
        String newpath = "D:\\liulanqi";
//        System.out.println("请输入要复制的文件名：");
        String filename = "lvtemporary_291821.xlsx";
        ReplaceFilePath.copy(filename, oldpath, newpath);
        System.err.println("复制完成！");*/
//        ExcelToList.WriteFile();

//        return "hellow Word";
        File f = new File("d:/old.txt");
        String c = f.getParent();
        File mm = new File(c + File.pathSeparator + "new.txt");
        if (f.renameTo(mm)) {
            System.out.println("修改成功!");
        } else {
            System.out.println("修改失败");
        }
        return "";
    }

    //    @RequestMapping("/biaofuzhu")
    public static void biaofuzhu(Connection connection, String filePath, String tableOrQuery) throws Exception {
        FileOutputStream fileOutputStream = null;
        try {
            CopyManager copyManager = new CopyManager((BaseConnection) connection);
            fileOutputStream = new FileOutputStream(filePath);
            copyManager.copyOut("COPY " + tableOrQuery + " TO STDOUT", fileOutputStream);
            System.err.println("COPY " + tableOrQuery + " TO STDOUT " + fileOutputStream);
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Connection GetConnection() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement statement = null;
        //String url = "jdbc:mysql://192.168.101.44/amon";
        String url = "jdbc:postgresql://127.0.0.1:5432/pgSQLTest";//换成自己PostgreSQL数据库实例所在的ip地址，并设置自己的端口
        //String user = "root";
        String user = "postgres";
        //String password = "560128";
        String password = "123456";  //在这里我的密码为空，读者可以自己选择是否设置密码
        //Class.forName("com.mysql.jdbc.Driver");
        Class.forName("org.postgresql.Driver");  //一定要注意和上面的MySQL语法不同
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("是否成功连接pg数据库" + connection);
        return connection;
    }

    @RequestMapping("/test")
    public void test() throws Exception {
        biaofuzhu(GetConnection(), "C:\\Users\\aifei\\Desktop\\bbz.xls", "copy");
    }


    @RequestMapping("/show")
    List<Lvtemporary> show() {
        List<Lvtemporary> list = service.showPGSql(new LvtemporaryExample());
        return list;
    }


    public static void main(String[] args) {
        String delString = "[test]".toString().replace("[", ")").replace("]", ")");
        System.err.println(delString);
    }


}
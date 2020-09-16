package com.lvtemporary.until;

import com.lvtemporary.entity.Lvtemporary;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelToList {
    private static Logger logger = Logger.getLogger(ExcelToList.class);
    private final static String xls = "xls";
    private final static String xlsx = "xlsx";

    public static List<Lvtemporary> excelToList() throws Exception {
        List<Lvtemporary> list = new ArrayList<Lvtemporary>();
        File file = new File("C:\\Users\\cheng\\Desktop\\test.xlsx");
        try {
            FileInputStream stream = FileUtils.openInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(stream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            int RowNumber = sheet.getPhysicalNumberOfRows() - 1;
            XSSFRow dinRow = sheet.getRow(0);
            for (int i = 2; i < RowNumber; i++) {
                XSSFRow row = sheet.getRow(i);
                int lastCellNumber = row.getLastCellNum();
                Lvtemporary lvtemporary = new Lvtemporary();
                for (int j = 0; j < lastCellNumber; j++) {
                    XSSFCell cell = row.getCell(j);
                    XSSFCell dinCell = dinRow.getCell(j);
                    if (cell == null) {
                        continue;
                    }
                    switch (cell.getCellType()) {
                        case HSSFCell.CELL_TYPE_NUMERIC:
                            System.err.print(dinCell.getStringCellValue() + ":");
                            System.err.print(String.valueOf(cell.getNumericCellValue()) + "\t");
                            ReflectionAssignment.ReflectionAssignmentToLvt(lvtemporary, dinCell.getStringCellValue(), String.valueOf(cell.getNumericCellValue()));
                            break;
                        case HSSFCell.CELL_TYPE_STRING:
                            System.err.print(dinCell.getStringCellValue() + ":");
                            System.err.print(cell.getStringCellValue() + "\t");
                            ReflectionAssignment.ReflectionAssignmentToLvt(lvtemporary, dinCell.getStringCellValue(), cell.getStringCellValue());
                            break;
                    }
                }
                System.out.println(lvtemporary);
                list.add(lvtemporary);
                System.err.println();
            }
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.err.println(list);
        return list;

    }

    public static List<Lvtemporary> excelToList2(String path) throws Exception {
        InputStream inputStream = new FileInputStream(path);
        XSSFWorkbook hssfWorkbook = new XSSFWorkbook(inputStream);
//        int size = hssfWorkbook.getNumberOfSheets();
        List<Lvtemporary> userList = new ArrayList<Lvtemporary>();
        for (int i = 0; i < 1; i++) {
            XSSFSheet sheet = hssfWorkbook.getSheetAt(i);
            int rowNum = sheet.getPhysicalNumberOfRows();
            System.err.println("数据行数" + rowNum);
            for (int rowIndex = 2; rowIndex < rowNum; rowIndex++) {
                XSSFRow row = sheet.getRow(rowIndex);
                XSSFRow row2 = sheet.getRow(0);
                Lvtemporary lvtemporary = new Lvtemporary();
                for (int cellIndex = 0; cellIndex < 31; cellIndex++) {
                    XSSFCell cell = row.getCell(cellIndex);
                    XSSFCell cell2 = row2.getCell(cellIndex);
                    if (cell == null) {
                        continue;
                    }
                    switch (cell.getCellType()) {
                        case HSSFCell.CELL_TYPE_NUMERIC:
                            System.err.println(String.valueOf(cell.getNumericCellValue()));
                            cell.setCellValue("");
                            break;
                        case HSSFCell.CELL_TYPE_STRING:
                            System.err.println(cell.getStringCellValue());
                            cell.setCellValue("");
                            break;
                    }
                    userList.add(lvtemporary);
                }
            }
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return userList;
    }
}
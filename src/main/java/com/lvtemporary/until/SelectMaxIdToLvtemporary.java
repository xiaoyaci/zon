package com.lvtemporary.until;

import com.lvtemporary.entity.Lvtemporary;
import com.lvtemporary.entity.LvtemporaryExample;
import com.lvtemporary.service.ILvtemporaryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SelectMaxIdToLvtemporary {

    @Autowired(required = true)
    private ILvtemporaryService service;

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
        return max;
    }

}

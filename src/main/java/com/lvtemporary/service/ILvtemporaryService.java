package com.lvtemporary.service;

import com.lvtemporary.entity.Lvtemporary;
import com.lvtemporary.entity.LvtemporaryExample;

import java.util.List;

public interface ILvtemporaryService {
    void add(Lvtemporary lmp);

    List<Lvtemporary> showServer(LvtemporaryExample example);

    List<Lvtemporary> showPGSql(LvtemporaryExample example);
}

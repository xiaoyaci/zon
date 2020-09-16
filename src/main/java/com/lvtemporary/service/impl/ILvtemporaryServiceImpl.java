package com.lvtemporary.service.impl;

import com.lvtemporary.conf.DataSourceSwitch;
import com.lvtemporary.conf.DataSourceDialect;
import com.lvtemporary.dao.LvtemporaryMapper;
import com.lvtemporary.entity.Lvtemporary;
import com.lvtemporary.entity.LvtemporaryExample;
import com.lvtemporary.service.ILvtemporaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ILvtemporaryServiceImpl implements ILvtemporaryService {
    @Autowired
    private LvtemporaryMapper mapper;

    @Override
    //增加postgres数据
    public void add(Lvtemporary lmp) {
        DataSourceSwitch.setDataSourceType(DataSourceDialect.SQLSERVER_SALVE);
        mapper.insertSelective(lmp);
    }

    @Override
    //查询SQLServer中的数据
    public List<Lvtemporary> showServer(LvtemporaryExample example) {
        DataSourceSwitch.setDataSourceType(DataSourceDialect.SQLSERVER);
        return mapper.selectByExample(example);
    }

    @Override
    //查询SQLPGSql中的数据
    public List<Lvtemporary> showPGSql(LvtemporaryExample example) {
        DataSourceSwitch.setDataSourceType(DataSourceDialect.SQLSERVER_SALVE);
        return mapper.selectByExample(example);
    }
}

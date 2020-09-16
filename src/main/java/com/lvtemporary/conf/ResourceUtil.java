package com.lvtemporary.conf;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@MapperScan(basePackages = "com.lvtemporary.lvtemporary.dao")
public class ResourceUtil {


    @Autowired
    private Environment env;

    /**
     *     * sqlServer数据源
     *     * @return
     *     
     */
    @Bean("sqlServer1") // bean的名称
    @ConfigurationProperties(prefix = "spring.datasource.slqserver1") // application.properteis中对应属性的前缀
    public DataSource sqlServer1DataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     *     * postgerSql数据源
     *     * @return
     *     
     */
    @Bean("sqlServer2") // bean的名称
    @ConfigurationProperties(prefix = "spring.datasource.slqserver2") // application.properteis中对应属性的前缀
    public DataSource sqlServer2DataSource() {
        return DataSourceBuilder.create().build();
    }

    /**
     * 动态数据源配置
     *
     * @return
     */

    @Primary
    @Bean("dataSource")
    public DynamicDataSource dataSource(@Qualifier("sqlServer1") DataSource sqlServer1,
                                        @Qualifier("sqlServer2") DataSource sqlServer2) {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();

        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put(DataSourceDialect.SQLSERVER, sqlServer1);
        targetDataSources.put(DataSourceDialect.SQLSERVER_SALVE, sqlServer2);
        dynamicDataSource.setTargetDataSources(targetDataSources);
        // 设置默认的数据源
        dynamicDataSource.setDefaultTargetDataSource(sqlServer1);
        return dynamicDataSource;
    }

    @Primary
    @Bean("sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory(@Qualifier("sqlServer1") DataSource sqlServer1, @Qualifier("sqlServer2") DataSource sqlServer2) throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();

        sessionFactory.setDataSource(this.dataSource(sqlServer1, sqlServer2));
        //sessionFactory.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapper-locations")));

        return sessionFactory.getObject();
    }

    @Bean("transactionManager")
    public DataSourceTransactionManager transactionManager(@Qualifier("dataSource") DynamicDataSource dataSource) throws Exception {
        return new DataSourceTransactionManager(dataSource);
    }
}
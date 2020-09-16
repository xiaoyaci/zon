package com.lvtemporary.conf;

public class DataSourceSwitch {

    private static ThreadLocal<DataSourceDialect> dataSourceDialect = new ThreadLocal<>();

    public static void setDataSourceType(DataSourceDialect dataSourceType) {
        dataSourceDialect.set(dataSourceType);
    }

    public static DataSourceDialect getDataSourceType() {
        return dataSourceDialect.get();
    }

    public static void removeDataSourceType() {
        dataSourceDialect.remove();
    }
}

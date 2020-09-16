package com.lvtemporary.conf;

public enum DataSourceDialect {
    SQLSERVER(1),
    SQLSERVER_SALVE(2);

    private Integer code;


    DataSourceDialect(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}

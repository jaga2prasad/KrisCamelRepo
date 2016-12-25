package com.angeras.kriscamel.util;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class AppDB {

	 final String url = "jdbc:mysql://localhost:3306/emp";
     final String url1 = "jdbc:mysql://localhost:3306/emp1";
     DataSource dataSource = setupDataSource(url);
     DataSource dataSource1 = setupDataSource1(url1);
     
    private static DataSource setupDataSource(String connectURI) {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUsername("angeras");
        ds.setPassword("letmein1.");
        ds.setUrl(connectURI);
        return ds;
    }

    private static DataSource setupDataSource1(String connectURI1) {
        BasicDataSource ds1 = new BasicDataSource();
        ds1.setDriverClassName("com.mysql.jdbc.Driver");
        ds1.setUsername("angeras");
        ds1.setPassword("letmein1.");
        ds1.setUrl(connectURI1);
        return ds1;
    }
}

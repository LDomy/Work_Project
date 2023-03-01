package com.company.web.Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SQLLogin {

    public SQLLogin() {
        Connection con = null;
        Statement st;


        try {
            Class.forName(DBConnection.getDriverName());
            con = DriverManager.getConnection(DBConnection.getAddress() + DBConnection.getDBName(), DBConnection.getUserName(), DBConnection.getPassword());

            st = con.createStatement();

            String get;





        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

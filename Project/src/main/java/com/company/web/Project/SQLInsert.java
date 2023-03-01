package com.company.web.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.sql.*;

public class SQLInsert {




    public SQLInsert(String name,String pass) throws SQLException, ClassNotFoundException {
        Connection con = null;
        Statement st;


        try {
            Class.forName(DBConnection.getDriverName());
            con = DriverManager.getConnection(DBConnection.getAddress() + DBConnection.getDBName(),DBConnection.getUserName(),DBConnection.getPassword());

            st = con.createStatement();

            String insert = "INSERT INTO users(email,password) values ('"+name+"',PASSWORD('"+pass+"'))";


            st.execute(insert);



        }catch (Exception e){
            e.printStackTrace();
        }


    }
}

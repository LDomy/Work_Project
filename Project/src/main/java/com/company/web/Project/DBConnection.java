package com.company.web.Project;

public class DBConnection {

    public static String DriverName = "com.mysql.cj.jdbc.Driver";
    public static String Address = "jdbc:mysql://localhost:3306/";
    public static String UserPass  = "?user=root&password=";
    public static String DBName = "projekt";
    public static String UserName = "root";
    public static String Password = "";



    public static String getDriverName() {return DriverName;}

    public static String getAddress() {
        return Address;
    }

    public static String getUserPass() {
        return UserPass;
    }

    public static String getDBName() {
        return DBName;
    }

    public static String getUserName() {
        return UserName;
    }

    public static String getPassword() {
        return Password;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mevrthisbang
 */
public class MyConnection {
    public static Connection getMyConnection() throws Exception{
        Connection conn=null;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        conn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=hanaShopManagement", "sa","123456");
        return conn;
    }
}

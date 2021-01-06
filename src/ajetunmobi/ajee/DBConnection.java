/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajetunmobi.ajee;
import java.sql.*;

/**
 *
 * @author Mobholar
 */
public class DBConnection {
    Connection conn = null;
    static final String DB_URL = "jdbc:mysql://localhost/ajee";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB(){
        Connection conn = null;
    try{
        //register jdbc driver, does not required for newer versions of jdk
        Class.forName("com.mysql.jdbc.Driver");
        //open a connection
        conn = DriverManager.getConnection(DB_URL, USER, PASS);
       // Statement st = preparedStatement();
        return conn;
    }catch(Exception ex){
        System.out.println("There were errors while connecting to DB.");
        return null;   
    }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Likhith
 */

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.*;
import javax.swing.*; 

public class DbConnection {
        String url = "jdbc:mysql://localhost:3306/library?useSSL=false";
        String mySqlPwd = "Passkey@123";
        String mySqlUser = "root";
        Connection conn = null;
        public Connection getConnection(){
            try{
                conn = DriverManager.getConnection(url,mySqlUser,mySqlPwd);
            }catch(Exception e){
                e.printStackTrace();
            }
            return conn;
        }
    
}

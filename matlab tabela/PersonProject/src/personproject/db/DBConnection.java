/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personproject.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student2
 */
public class DBConnection {
    private static DBConnection instance;
    private Connection connection;
    
    private DBConnection() {
        String url = "jdbc:mysql://localhost:3307/pro_soft_d2";
        String user = "root";
        String password = "";
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            System.out.println("Connection error: " + ex);
        }
    }

    public static DBConnection getInstance() {
        if (instance == null)
            instance = new DBConnection();
        return instance;
        //return new DBConnection();
    }

    public Connection getConnection() {
        return connection;
    }
    
//    public static void main(String[] args) {
//        DBConnection proba = new DBConnection();
//        System.out.println("Connection successful!");
//    }
}

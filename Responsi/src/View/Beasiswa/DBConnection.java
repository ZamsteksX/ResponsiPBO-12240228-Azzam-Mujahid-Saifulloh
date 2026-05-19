package database;
import java.sql.Connection;
import java sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab Informatika
 */
public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/scholarship_db";
    private static final String USER = "root";
    private static final Strimg PASSWORD = "";
    private static Connection connection = null;
    private DBConnection(){}
    public static Connection getConnection() throws SQLException{
        if(connection == null || connection.isClosed()){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection(URL,USER,PASSWORD);
            } catch (ClassNotFoundException e){
                throw new SQLException("MySQL JDBC Driver tidak ketemu: "
                +e.getMessage());
            }
        }
        return connection;
    }
    public static void closeConnection(){
        if(connection!=null){
            try {connection.close(); connection = null;}
            catch (SQLException e){
                System.err.println("Error menutup koneksi: " +e.getMessage());
            }
        }
    }
}

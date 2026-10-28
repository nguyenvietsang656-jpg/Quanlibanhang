/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banhang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nguyen Viet Sang
 */
public class Ketnoi {
     public static Connection getConnection() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;"
                       + "databaseName=QuanLyBanHang;"
                       + "encrypt=true;"
                       + "trustServerCertificate=true";

            String user = "sang";
            String password = "123456";

            return DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

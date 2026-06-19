/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calmirea;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {

    private static Connection koneksi;

    public static Connection getKoneksi() {

        try {

            String url =
                "jdbc:mysql://localhost:3306/calmirea";

            String user = "root";

            String password = "";

            DriverManager.registerDriver(
                    new com.mysql.cj.jdbc.Driver());

            koneksi =
                    DriverManager.getConnection(
                            url,
                            user,
                            password);

            System.out.println(
                    "Koneksi Database Berhasil");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Koneksi Gagal : "
                    + e.getMessage());

        }

        return koneksi;
    }
}

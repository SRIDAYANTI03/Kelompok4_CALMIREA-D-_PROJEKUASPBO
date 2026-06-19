/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calmirea;
/**
 *
 * @author qilah filzah
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class KoneksiDataUser {

    public static Connection getKoneksi() {

        Connection koneksi = null;

        try {

            String url = "jdbc:mysql://localhost:3306/calmirea";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(
                    new com.mysql.cj.jdbc.Driver()
            );

            koneksi = DriverManager.getConnection(
                    url,
                    user,
                    pass
            );

            System.out.println("Koneksi Berhasil");

        } catch (Exception e) {

            System.out.println("Koneksi Gagal");
            System.out.println(e);

        }

        return koneksi;

    }

}



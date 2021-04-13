/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author imadariaga
 */
public class SQLiteKudeatu {

    private static String db = "db/IzenenDBa.db";

    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:" + db;
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            //  System.out.println("Connection to SQLite has been established.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }

    public static ArrayList<Izena> irakurri() {
        ArrayList<Izena> alIzenak = new ArrayList<>();
        String taula = "Izenak";
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = connect();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Izena iz = new Izena(rs.getInt("id"), rs.getString("izena"));
                alIzenak.add(iz);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return alIzenak;
    }
    
    public static int gehitu(Izena i) {

        String sql = "INSERT INTO Izenak(izena) VALUES('"+i.getIzena()+"')";

        try (Connection conn = connect();
             Statement stmt = conn.createStatement()) {
            
            return stmt.executeUpdate(sql);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }


}

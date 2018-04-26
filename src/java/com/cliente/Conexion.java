/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Raymundo Jimenez
 */
public class Conexion {
  
    //local JRJR
    private static String ip = "localhost";
    private static String port = "3306";
    private static String database = "evidencia";
    private static String user = "root";
    private static String pass = "Toluca55";

    public static Connection getConexion() {

        Connection conn = null;
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }

            conn = DriverManager.getConnection(
                    "jdbc:mysql://" + ip + ":" + port + "/" + database + "?"
                    + "user=" + user + "&password=" + pass);

// Do something with the Connection


        } catch (SQLException ex) {
// handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        return conn;
    }
}

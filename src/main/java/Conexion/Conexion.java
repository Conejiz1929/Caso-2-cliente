/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author José Sequeira
 */

public class Conexion {

    private static final String URL = "jdbc:mysql://localhost:3306/rancho_ganadero";
    private static final String USER = "root";
    private static final String PASSWORD = "Server"; // tu contraseña real

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Metodo de prueba para verificar la conexion
    public static void main(String[] args) {
        try (Connection conn = Conexion.getConnection()) {
            if (conn != null) {
                System.out.println("Conexion exitosa a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
    }
}

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


public class PruebaConexion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/rancho_ganadero";
        String usuario = "root"; // Reemplaza con tu usuario
        String contrasena = "";  // Reemplaza con tu contraseña

        try {
            Connection conexion = DriverManager.getConnection(url, usuario, contrasena);
            if (conexion != null) {
                System.out.println("Conexion exitosa a la base de datos.");
                conexion.close();
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos.");
            e.printStackTrace();
        }
    }
}


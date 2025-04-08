/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Conexion.Conexion;
import Modelo.Animal;
/**
 *
 * @author José Sequeira
 */




import java.sql.Connection;
import java.sql.PreparedStatement;

public class AnimalDAO {
    public boolean registrarAnimal(Animal animal) {
        String sql = "INSERT INTO animal (identificacion, raza, sexo, fecha_nacimiento, peso_nacimiento, nombre, color_pelaje, notas, es_comprado, fecha_compra, hato_origen, fotografia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, animal.getIdentificacion());
            stmt.setString(2, animal.getRaza());
            stmt.setString(3, animal.getSexo());
            stmt.setString(4, animal.getFechaNacimiento());
            stmt.setDouble(5, animal.getPesoNacimiento());
            stmt.setString(6, animal.getNombre());
            stmt.setString(7, animal.getColorPelaje());
            stmt.setString(8, animal.getNotas());
            stmt.setBoolean(9, animal.isEsComprado());
            stmt.setString(10, animal.getFechaCompra());
            stmt.setString(11, animal.getHatoOrigen());
            stmt.setString(12, animal.getFotografia());

            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}

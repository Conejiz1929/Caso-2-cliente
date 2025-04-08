/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import Conexion.Conexion;
import Modelo.Evento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author José Sequeira
 */
public class EventoDAO {
     public boolean registrarEvento(Evento evento) {
        String sql = "INSERT INTO evento (id_animal, tipo_evento, fecha_evento, estado, detalles) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, evento.getId_animal());
            stmt.setString(2, evento.getTipo_evento());
            stmt.setString(3, evento.getFecha_evento());
            stmt.setString(4, evento.getEstado());
            stmt.setString(5, evento.getDetalles());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Error al registrar evento: " + e.getMessage());
            return false;
        }
    }
    public ArrayList<Evento> obtenerEventos() {
        ArrayList<Evento> lista = new ArrayList<>();
        String sql = "SELECT * FROM evento";

        try (Connection conn = Conexion.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Evento e = new Evento();
                e.setId_evento(rs.getInt("id_evento"));
                e.setId_animal(rs.getInt("id_animal"));
                e.setTipo_evento(rs.getString("tipo_evento"));
                e.setFecha_evento(rs.getString("fecha_evento"));
                e.setEstado(rs.getString("estado"));
                e.setDetalles(rs.getString("detalles"));
                lista.add(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}


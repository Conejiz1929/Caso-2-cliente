/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.*;
import java.net.*;

/**
 *
 * @author José Sequeira
 */

public class Historial extends JFrame {

    private JTextField txtIdentificacion;
    private JButton btnBuscar;
    private JTable tabla;
    private DefaultTableModel modelo;

    public Historial() {
        setTitle("Historial de Eventos");
        setLayout(null);
        setSize(600, 400);

        txtIdentificacion = new JTextField();
        btnBuscar = new JButton("Buscar");
        modelo = new DefaultTableModel(new String[]{"Evento", "Fecha", "Estado", "Detalles"}, 0);
        tabla = new JTable(modelo);

        txtIdentificacion.setBounds(30, 20, 200, 25);
        btnBuscar.setBounds(250, 20, 100, 25);
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(30, 60, 500, 250);

        add(txtIdentificacion);
        add(btnBuscar);
        add(scroll);

        btnBuscar.addActionListener(e -> buscarHistorial());
    }

    private void buscarHistorial() {
        try (Socket socket = new Socket("localhost", 5000); 
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream()); 
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {

            String idAnimal = txtIdentificacion.getText();
            if (idAnimal.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese el ID del animal.");
                return;
            }

            // Enviar la solicitud para consultar el historial con el id_animal
            out.writeObject("CONSULTAR_HISTORIAL");
            out.writeObject(idAnimal);

            modelo.setRowCount(0); // Limpiar la tabla antes de llenar con los nuevos datos
            Object[] fila;
            while ((fila = (Object[]) in.readObject()) != null) {
                modelo.addRow(fila); // Agregar los resultados a la tabla
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}


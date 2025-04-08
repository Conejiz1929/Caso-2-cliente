/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import dao.EventoDAO;
import Modelo.Evento;

import javax.swing.*;

/**
 *
 * @author José Sequeira
 */
public class Eventos extends JFrame {

    private JTextField txtIdEvento, txtIdAnimal, txtTipo, txtFecha, txtEstado, txtDetalles;
    private JButton btnGuardar;

    public Eventos() {
        setTitle("Registrar Evento");
        setSize(400, 300);
        setLayout(null);

        JLabel lbl1 = new JLabel("ID Evento:");
        lbl1.setBounds(20, 20, 100, 25);
        add(lbl1);

        txtIdEvento = new JTextField();
        txtIdEvento.setBounds(140, 20, 200, 25);
        add(txtIdEvento);

        JLabel lbl2 = new JLabel("ID Animal:");
        lbl2.setBounds(20, 50, 100, 25);
        add(lbl2);

        txtIdAnimal = new JTextField();
        txtIdAnimal.setBounds(140, 50, 200, 25);
        add(txtIdAnimal);

        JLabel lbl3 = new JLabel("Tipo Evento:");
        lbl3.setBounds(20, 80, 100, 25);
        add(lbl3);

        txtTipo = new JTextField();
        txtTipo.setBounds(140, 80, 200, 25);
        add(txtTipo);

        JLabel lbl4 = new JLabel("Fecha (YYYY-MM-DD):");
        lbl4.setBounds(20, 110, 150, 25);
        add(lbl4);

        txtFecha = new JTextField();
        txtFecha.setBounds(170, 110, 170, 25);
        add(txtFecha);

        JLabel lbl5 = new JLabel("Estado:");
        lbl5.setBounds(20, 140, 100, 25);
        add(lbl5);

        txtEstado = new JTextField();
        txtEstado.setBounds(140, 140, 200, 25);
        add(txtEstado);

        JLabel lbl6 = new JLabel("Detalles:");
        lbl6.setBounds(20, 170, 100, 25);
        add(lbl6);

        txtDetalles = new JTextField();
        txtDetalles.setBounds(140, 170, 200, 25);
        add(txtDetalles);

        btnGuardar = new JButton("Registrar Evento");
        btnGuardar.setBounds(120, 210, 150, 30);
        add(btnGuardar);

        btnGuardar.addActionListener(e -> {
            int id_evento = Integer.parseInt(txtIdEvento.getText()); // Se obtiene el id_evento desde el campo
            int id_animal = Integer.parseInt(txtIdAnimal.getText());
            String tipo_evento = txtTipo.getText();
            String fecha_evento = txtFecha.getText();
            String estado = txtEstado.getText();
            String detalles = txtDetalles.getText();

            Evento evento = new Evento(id_evento, id_animal, tipo_evento, fecha_evento, estado, detalles);
            EventoDAO dao = new EventoDAO();

            if (dao.registrarEvento(evento)) {
                JOptionPane.showMessageDialog(this, "Evento registrado correctamente");
                limpiarCampos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar evento");
            }
        });

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    private void limpiarCampos() {
        txtIdEvento.setText("");
        txtIdAnimal.setText("");
        txtTipo.setText("");
        txtFecha.setText("");
        txtEstado.setText("");
        txtDetalles.setText("");
    }
}


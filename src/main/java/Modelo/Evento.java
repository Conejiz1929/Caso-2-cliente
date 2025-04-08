package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author José Sequeira
 */
public class Evento {

    private int id_evento;
    private int id_animal;
    private String tipo_evento;
    private String fecha_evento;
    private String estado;
    private String detalles;

    public Evento(int id_evento, int id_animal, String tipo_evento, String fecha_evento, String estado, String detalles) {
        this.id_evento = id_evento;
        this.id_animal = id_animal;
        this.tipo_evento = tipo_evento;
        this.fecha_evento = fecha_evento;
        this.estado = estado;
        this.detalles = detalles;
    }

    public Evento() {
        
    }

    public int getId_evento() {
        return id_evento;
    }

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public int getId_animal() {
        return id_animal;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public String getTipo_evento() {
        return tipo_evento;
    }

    public void setTipo_evento(String tipo_evento) {
        this.tipo_evento = tipo_evento;
    }

    public String getFecha_evento() {
        return fecha_evento;
    }

    public void setFecha_evento(String fecha_evento) {
        this.fecha_evento = fecha_evento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    
}

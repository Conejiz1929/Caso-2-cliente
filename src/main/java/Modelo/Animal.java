/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author José Sequeira
 */
public class Animal {

    private int id;
    private String identificacion;
    private String raza;
    private String sexo;
    private String fechaNacimiento;
    private double pesoNacimiento;
    private String nombre;
    private String colorPelaje;
    private String notas;
    private boolean esComprado;
    private String fechaCompra;
    private String hatoOrigen;
    private String fotografia;

    // Constructor, getters y setters
    public Animal(String identificacion, String raza, String sexo, String fechaNacimiento,
            double pesoNacimiento, String nombre, String colorPelaje, String notas,
            boolean esComprado, String fechaCompra, String hatoOrigen, String fotografia) {
        this.identificacion = identificacion;
        this.raza = raza;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoNacimiento = pesoNacimiento;
        this.nombre = nombre;
        this.colorPelaje = colorPelaje;
        this.notas = notas;
        this.esComprado = esComprado;
        this.fechaCompra = fechaCompra;
        this.hatoOrigen = hatoOrigen;
        this.fotografia = fotografia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPesoNacimiento() {
        return pesoNacimiento;
    }

    public void setPesoNacimiento(double pesoNacimiento) {
        this.pesoNacimiento = pesoNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public boolean isEsComprado() {
        return esComprado;
    }

    public void setEsComprado(boolean esComprado) {
        this.esComprado = esComprado;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getHatoOrigen() {
        return hatoOrigen;
    }

    public void setHatoOrigen(String hatoOrigen) {
        this.hatoOrigen = hatoOrigen;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    
}

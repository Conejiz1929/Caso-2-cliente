/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Producto;

import Producto.Producto;

/**
 *
 * @author José Sequeira
 */
public class ProductoElectronico extends Producto {

    private String marca;
    private String modelo;

    public ProductoElectronico(String marca, String modelo, String codigo, String nombre, int cantidad, double precio, String categoria) {
        super(codigo, nombre, cantidad, precio, categoria);
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return getNombre() + " - Marca: " + marca + " - Modelo: " + modelo + " - Precio: $" + getPrecio();
    }
}

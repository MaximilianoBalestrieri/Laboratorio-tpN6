/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author CCMEW
 */
public class Producto {
    private int codigo;
    private String descripcion;
    private int stock;
    private int precio;
    private String categoria;

    public Producto(int codigo, String descripcion, int stock, int precio, String categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    
}

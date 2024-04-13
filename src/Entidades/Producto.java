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
public class Producto implements Comparable<Producto>{
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

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Producto o) {
         if(this.codigo==o.codigo){            
            return 0;          
        }else if(this.codigo >o.codigo){       
            return 1;
        }else {       
            return -1;
        }
    }
    
    public String toString(){  
       return codigo+" "+ " descripción: "+ descripcion;
   }
    }
    
    
    


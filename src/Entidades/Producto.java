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
    private double precio;
    private Rubro rubro;

    public Producto(int codigo, String descripcion, int stock, double precio, Rubro rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.rubro = rubro;
    }

    public Producto() {
    }

    public Producto(int codigo, String descripcion, double precio, Rubro rubro, int stock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Rubro getRubro() {
        return rubro;
    }

    public void setRubro(String categoria) {
        this.rubro = rubro;
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
    
    
    


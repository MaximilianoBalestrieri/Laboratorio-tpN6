package Entidades;


public class Rubro {
     private int id;
    private String nombre;

    public Rubro(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Rubro() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        final Rubro other =(Rubro) obj;
        if(this.id != other.id){
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
       int hash = 5;
        hash = 83 * hash + this.id;
        return hash;
    }
    
    
    
}

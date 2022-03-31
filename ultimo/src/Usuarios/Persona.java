
package Usuarios;


public class Persona {
    
    // caracateristicas de una clase
    public int edad;
    public String nombre;
    public boolean mayorEdad;
    
    // constructor
    public Persona(int edad,String nombre, boolean mayorEdad){
        this.edad = edad;
        this.nombre = nombre;
        this.mayorEdad = mayorEdad;
    }
        
    // metodos get y set 
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }
    
}

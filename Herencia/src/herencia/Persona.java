/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author joshu
 */
public class Persona {
    
    int dpi;
    String nombre;
    String apellido;

    // constructor vacio
    public Persona(){}
    
    // metodo constructor
    public Persona(int dpi, String nombre, String apellido) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
}

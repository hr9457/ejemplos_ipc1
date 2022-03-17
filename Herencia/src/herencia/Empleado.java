/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author joshu
 */
public class Empleado extends Persona{
    
    int sueldo;
    int numero_empleado;
    
    public Empleado(){}

   
    public Empleado(int dpi, String nombre, String apellido,int sueldo, int numero_empleado) {
        super(dpi, nombre, apellido);
        this.sueldo = sueldo;
        this.numero_empleado = numero_empleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumero_empleado() {
        return numero_empleado;
    }

    public void setNumero_empleado(int numero_empleado) {
        this.numero_empleado = numero_empleado;
    }
    
    
    
    
    
}

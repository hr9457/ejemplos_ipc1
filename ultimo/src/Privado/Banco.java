
package Privado;


public class Banco {
    
    // caracteristicas
    private String nombre;
    private int telefono;
    private int dinero;

    // constructor
    public Banco(String nombre, int telefono, int dinero) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.dinero = dinero;
    }

    //pagar
    public int retiro(int cantidad){
        if (cantidad < dinero){
            return cantidad;
        } else {
            return 0;
        }
    }
    
    // metodo get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    private int getDinero() {
        return dinero;
    }

    private void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    
    
}

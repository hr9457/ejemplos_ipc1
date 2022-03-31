
package Protegido;


public class Leon extends Cafe{

    String color;
    int precio;
    
    public Leon(String nombre, int cantidad,String color, int precio) {
        super(nombre, cantidad);
        this.color = color;
        this.precio = precio;
    }
    
    // metodods
    public void presentacion(){
        System.out.println("Cantidad: "+this.cantidad +
                " Color: "+ this.color+" Precio: "+this.precio);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    
    
}

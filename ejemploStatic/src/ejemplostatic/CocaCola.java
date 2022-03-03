/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplostatic;

/**
 *
 * @author joshu
 */
public class CocaCola {
    
    // caracteristicas
    static int precio = 5;
    int cantidad = 450;
    String Color = "Cafe";
    
    
    //constructor
    CocaCola(){}
    
    // funciones estatticas
    static public void cambiarPrecio(int nuevoPrecio){
        precio = nuevoPrecio;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplostatic;

/**
 *
 * @author joshu
 */
public class EjemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CocaCola bebida1 = new CocaCola();
        CocaCola bebida2 = new CocaCola();
        
        CocaCola.cambiarPrecio(20);
        
        System.out.println("************obj1***********");
        System.out.println(bebida1.precio);
        System.out.println(bebida1.cantidad);
        System.out.println(bebida1.Color);        
        System.out.println("*************obj2**********"); 
        
        System.out.println(bebida2.precio);
        System.out.println(bebida2.cantidad);
        System.out.println(bebida2.Color);
        
    }
    
}

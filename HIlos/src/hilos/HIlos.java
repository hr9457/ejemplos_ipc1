/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hilos;

/**
 *
 * @author joshu
 */
public class HIlos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Proceso p = new Proceso();
        Proceso2 p2 = new Proceso2();
        Reloj r = new Reloj();
        
        p.start();
        p2.start();
        r.start();
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author joshu
 */
public class Proceso extends Thread{
    
    @Override
    public void run(){
        for (int i=0; i<=100; i++){
            System.out.println("Proceso 1");
            
            try {
                sleep(300);
            } catch (Exception e) {
            }      
        }
    }
    
}

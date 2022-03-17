/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;

/**
 *
 * @author joshu
 */
public class Proceso2 extends Thread{
    
    @Override
    public void run(){
        for (int i=0; i<=100; i++){
            System.out.println("Proceso 2");
            
            try {
                sleep(1000);
            } catch (Exception e) {
            }           
        }
    }
}

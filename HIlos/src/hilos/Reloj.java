/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author joshu
 */
public class Reloj extends Thread{
    
    int minutos=0;
    int segundos=0;

      
    public void reloj(){
        for(int i=0;i<=100000;i++){
           
            if(segundos==30){
                segundos=0;
                minutos++;
            } 
            System.out.println("--> M:"+minutos+" S: "+segundos);
            segundos++;
        try {
            sleep(300);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
       }
    }
    
    
    
    // creacion del hilo
    @Override
    public void run(){
        reloj();
    }
    
}

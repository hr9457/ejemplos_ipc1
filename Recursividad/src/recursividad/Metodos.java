/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad;

/**
 *
 * @author joshu
 */
public class Metodos {
    
    int edad;
    
    
    public int factorial(int num){
        if(num == 0){
            return 1;
        } else {
           return num * factorial(num -1);
        }
    }
    
    
    public void imprimir(int x){
        if(x<=5){
            System.out.println(x);
            imprimir(x + 1);
        }
    }
    
    public void Saludar(){
        System.out.println("Hola mundo");
    }

    public int suma(int numero1, int numero2){
        return numero1 + numero2;
    }
    
    public double  a(){
        return 0.0;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}

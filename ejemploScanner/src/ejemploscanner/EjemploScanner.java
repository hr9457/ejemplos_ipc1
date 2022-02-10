/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploscanner;
import java.util.Scanner;

/**
 *
 * @author joshu
 */
public class EjemploScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // TODO code application logic here
        
        //variables
        int opcion;
        int edad;
        String nombre;
        int arreglo[] = new int[5];
        arreglo[0] = 3;
        arreglo[1] = 4;
        arreglo[2] = 8;
        arreglo[3] = 10;
        arreglo[4] = 100;
        System.out.println(arreglo[4]);
//        
        Scanner entrada = new Scanner(System.in);
//        
        System.out.println("1. jugar");
        System.out.println("2. salir");
        System.out.print("Ingrese una opcion: ");
        opcion = entrada.nextInt();
        
        System.out.println(opcion);
        
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.next();
        System.out.println(nombre);
        System.out.print("Ingrese su edad");
        edad = entrada.nextInt();
        System.out.println(edad);
        
        
        String movimiento;
        
        System.out.print("ingrese el movimiento: ");
        movimiento = entrada.next();
        System.out.println(movimiento);
        
        if(movimiento.equals("w")){
            System.out.println("arriba");
        } else if(movimiento.equals("a")){
            System.out.println("izquierda");
        } else {
            System.out.println("movimiento no valido");
        }
        
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
}

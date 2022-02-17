/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author joshu
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creando objetos de tipo perro utilizando la clase Perro
        Perro perro1 = new Perro("Rodolfo","negro",10);
        Perro perro2 = new Perro("Aisha","blanco",5);
        
        perro1.informacion();
        perro1.comer();
        perro1.mimir();
        
        System.out.println("-----------------------------");
        
        perro2.informacion();
        perro2.caminar();
        perro2.comer();
        
        
        
        
        System.out.println("***********************************");
        
        // arreglo de objetos
        int[] arreglo = new int[3];
        

        //<tipo>[] <nombre> = new <tipo>[cantidad];
        
        Perro[] mascotas = new Perro[3];
        
        // 
        mascotas[0] = new Perro("Goofy","negro",20);
        mascotas[1] = new Perro("Togo","cafe",10);
        mascotas[2] = new Perro("Barry","blanco",5);
        
        //ejemplo
        System.out.println(mascotas[0]);
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        System.out.println("nombre: "+mascotas[0].getNombre());
        System.out.println("Color: "+mascotas[0].getColor());
        System.out.println("Edad: "+mascotas[0].getEdad());
        
        
        System.out.println("");
        
        // cambiandole el nombre a goofy
        mascotas[0].setNombre("Enzo");
        
        // verificando datos para el cambio de nombre
        System.out.println("nombre: "+mascotas[0].getNombre());
        System.out.println("Color: "+mascotas[0].getColor());
        System.out.println("Edad: "+mascotas[0].getEdad());
        
        
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        for(int i=0; i<mascotas.length; i++){
            System.out.println("nombre: "+mascotas[i].getNombre());
            System.out.println("Color: "+mascotas[i].getColor());
            System.out.println("Edad: "+mascotas[i].getEdad());
            System.out.println("");
        }
        
        
    }
    
}

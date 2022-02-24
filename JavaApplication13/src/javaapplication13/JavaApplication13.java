/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;

/**
 *
 * @author joshu
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creando mi almacenamiento para mis usuarios
        Usuario[] usuarios = new Usuario[10];
        int contador = 1;
        
        // usuario por defecto creado - Administrador
        // colocado en la primera posicion del arreglo
        usuarios[0] = new Usuario(0,"Administrador","Administrador","123");
        usuarios[contador] = new Usuario(1,"Hector","Orozco","123");
        contador++;
        usuarios[contador] = new Usuario(2,"Jostin","Villagran","123");
        contador++;
        usuarios[contador] = new Usuario(3,"Daniel","Villagran","123");
        
        Login login = new Login(usuarios);
        login.setVisible(true);
    }
    
}

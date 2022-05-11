/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author joshu
 */
public class Perro {
    //atributos o caracteristicas
    String nombre;
    String color;
    int edad;
    
    
    //metodo constructor
    Perro(String nombre, String color, int edad){
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }
    
    //funciones
    
    //funcion para comer
    void comer(){
        System.out.println("Estoy comiendo");
    }
    
    //funcion para domri
    void mimir(){
        System.out.println(nombre+" Estoy mimiendo");
    }
    
    // funcon para caminar
    void caminar(){
        System.out.println("Estoy caminando");
    }
    
    
    //funcion para presentar
    void informacion(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Color: "+this.color);
    }

    
    // metodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}

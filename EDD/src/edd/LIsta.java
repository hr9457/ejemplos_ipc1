/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd;

/**
 *
 * @author joshu
 */
public class LIsta {
    
    Nodo primero;
    Nodo ultimo;
    
    private boolean estado;
    
    LIsta(){
        this.primero = null;
        this.ultimo = null;
        this.estado = false;
    }
    
    // cual es el estado actual de mi lista
    public boolean estadoLista(){
        if(this.primero!=null && this.ultimo!=null){
            return true;
        } else {
            return false;
        }
    }
    
    public void insertar(String nombre, int edad){
        // 1. mi lista esta vacia
        if(this.estado == false){
            Nodo informacion = new Nodo(nombre,edad);
            this.primero = informacion;
            this.ultimo = informacion;
            this.estado = true;
        } 
    }
    
    public void insertarUltimo(String nombre,int edad){
        //1. ver estado de mi lista
        if(estadoLista()==true){
            Nodo nuevoNodo = new Nodo(nombre,edad);
            Nodo auxNodo;
            auxNodo = this.ultimo;
            this.ultimo = nuevoNodo;
            nuevoNodo.anterior = auxNodo;
            auxNodo.siguiente = nuevoNodo;
        }
    }
    
}

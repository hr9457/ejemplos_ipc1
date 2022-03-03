/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package creacionarchivos;

/**
 *
 * @author joshu
 */
public class Usuarios {
    //atributos o caracteristicas
    int dpi;
    String nombreUsuario;
    String apellidoUsuario;
    int rol;// 0 = admi , 1 = usuario normal
    String password;
    
    // constructor
    // ( parametro1, parametro2, parametro3 )
    Usuarios(int dpi,String nombreUsuario, String apellidoUsuario, String password){
        this.dpi = dpi;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.password = password;
    }
    
    
    // funciones y metodos
    public void comer(){
        System.out.println("Vamos a Comer!!!!");
    }
    
    public void hablar(){
        System.out.println("Hola mundo!!!!!!!!!!!");
    }
    
    
    // get y set

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

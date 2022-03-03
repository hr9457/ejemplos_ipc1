/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package creacionarchivos;

import java.io.*;


/**
 *
 * @author joshu
 */
public class CreacionArchivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // creando mi almacenamiento para mis usuarios
        Usuarios[] usuarios = new Usuarios[10];
        
        // usuario por defecto creado - Administrador
        // colocado en la primera posicion del arreglo
        usuarios[0] = new Usuarios(0,"Administrador","Administrador","123");
        usuarios[1] = new Usuarios(1,"Hector","Orozco","123");
        usuarios[2] = new Usuarios(2,"Jostin","Villagran","123");
        usuarios[3] = new Usuarios(3,"Daniel","Villagran","123");
        
        
        // para crear un archivo
        File archivo = new File("Reportes\\usuarios.html");
        // aperturar un archivo
        FileWriter escribir;
        // crear nuevas lineas dentro un archivo
        PrintWriter nuevaLinea;
        
        // verifico si mi archivo existe o no existe
        if(!archivo.exists()){
            try {
                //crear mi archivo
                archivo.createNewFile();
                // le pasao el archivo donde quiero escribir, true 
                escribir = new FileWriter(archivo,true);
                // escribiendo dentro de mi archivo
                nuevaLinea = new PrintWriter(escribir);
                nuevaLinea.println("<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "<head>\n" +
                                    "    <meta charset=\"UTF-8\">\n" +
                                    "    <title>Document</title>\n" +
                                    "</head>\n" +
                                    "<body>");
                
                nuevaLinea.println("<h1>Ejemplo de archivo</h1>");
                nuevaLinea.println("<table>");
                for(int i=0; i<usuarios.length;i++){
                    //solo cuando los datos existan
                    if(usuarios[i]!=null){
                        nuevaLinea.println("<tr>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getNombreUsuario());
                        nuevaLinea.print("</td>");
                        nuevaLinea.println("</tr>");
                    }
                }
                nuevaLinea.println("</table>");
                
                // ---------------------------
                nuevaLinea.println("</body>\n" +
                                   "</html>");
                // me cierra mi archivo
                escribir.close();
                
                
            } catch (Exception e) {
                
            }
        }else{
            try {
                // le pasao el archivo donde quiero escribir, true 
                escribir = new FileWriter(archivo,true);
                // escribiendo dentro de mi archivo
                nuevaLinea = new PrintWriter(escribir);
                nuevaLinea.println("<!DOCTYPE html>\n" +
                                    "<html lang=\"en\">\n" +
                                    "<head>\n" +
                                    "    <meta charset=\"UTF-8\">\n" +
                                    "    <title>Document</title>\n" +
                                    "</head>\n" +
                                    "<body>");
                
                nuevaLinea.println("<h1>Ejemplo de archivo</h1>");
                nuevaLinea.println("<table>");
                for(int i=0; i<usuarios.length;i++){
                    //solo cuando los datos existan
                    if(usuarios[i]!=null){
                        nuevaLinea.println("<tr>");
                        nuevaLinea.print("<td>");
                        nuevaLinea.print(usuarios[i].getNombreUsuario());
                        nuevaLinea.print("</td>");
                        nuevaLinea.println("</tr>");
                    }
                }
                nuevaLinea.println("</table>");
                
                // ---------------------------
                nuevaLinea.println("</body>\n" +
                                   "</html>");
                // me cierra mi archivo
                escribir.close();
            } catch (Exception e) {
            }
        }
    }
    
}

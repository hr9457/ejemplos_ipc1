/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;
import java.util.Random;

/**
 *
 * @author joshu
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int filas = 9;
        int columnas =9;
        
        // creacion para manejo del tablero
        char tablero[][] = new char[filas][columnas];
        
        tablero[3][3] = '#';
        tablero[5][5] = '%';
        tablero[7][5] = 'V';
        
        // variables para maximos y minimos
        int minimoColumnas = 1;
        int maximoColumnas = columnas -2;
        
        int minimoFilas = 1;
        int maximoFilas = filas - 2;
        
        Random random = new Random();
        
        //int columnaRandom = random.nextInt(maximoColumnas + minimoColumnas) + minimoColumnas;
        //int filaRandom = random.nextInt(maximoFilas + minimoFilas) + minimoFilas;
        
        //System.out.println(columnaRandom+","+filaRandom);
        
        //generado muros al azar
        // genracion de solo 10 muros quemados esto se debe cambiar segun el tamanio del tablero
        // no siempre de de ser 10 esto lo hize solo para comprobar
        int muros = 0;
        do{    
            // genracion de posciones x y y con libreria random
            int columnaRandom = random.nextInt(maximoColumnas + minimoColumnas) + minimoColumnas;
            int filaRandom = random.nextInt(maximoFilas + minimoFilas) + minimoFilas;


            if(tablero[filaRandom][columnaRandom] != '#' && tablero[filaRandom][columnaRandom] 
                    != '%' && tablero[filaRandom][columnaRandom] != '*' && tablero[filaRandom][columnaRandom] != 'V'){
                tablero[filaRandom][columnaRandom] = '*';
                muros++;
            } 

        }while(muros<=10);
        
        // for para filas
        for(int i=0; i<9; i++){
            // for para columnas
            for(int j=0; j<9; j++){
//                System.out.print("1"); 
                    if(tablero[i][j]=='*' || tablero[i][j]=='#' || tablero[i][j]=='%' || tablero[i][j]=='V'){
                        System.out.print(tablero[i][j]);
                    }else{
                        System.out.print(" ");
                    }
                    
            }
            // salto de linea para pasar a la siguiente fila
            System.out.println("");
        }
        
    }
    
}

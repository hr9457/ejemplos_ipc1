package ultimo;

// importaciones
import Usuarios.Persona;
import Privado.Banco;
import Protegido.*;

public class Ultimo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persona1 = new Persona(20,"juan",true);
        System.out.println(persona1.isMayorEdad());
        
        Banco banco1 = new Banco("Banrural", 123, 1000);
        System.out.println(banco1.retiro(2000));
        
        Leon coffe = new Leon("Empresa X", 5, "Cafe", 45);
        coffe.presentacion();
        
    }
    
}


package Pizza;

import java.util.Scanner;


public class Queso extends Pizza {
    
    //si es privado debo de ocupar un objeto para poder acceder a el

    public Queso() {
    }

    public Queso(String masa, String[] salsa, String[] ingredientes, int tamanio) {
        super(masa, salsa, ingredientes, tamanio);
        this.ingredientes = new String[2];
        this.ingredientes[0] = "Parmesano";
        this.ingredientes[1] = "Mozzarela";
    }
    
    //queremos elegir un tipo de queso
    public String elegirtipoqueso(){
        //es un metodo void, o string?
        Scanner entrada = new Scanner(System.in);
        String queso;
        System.out.println("Elije el queso que deseas");
        System.out.println("1.- Parmesano");
        System.out.println("2.- Mozzalera");
        queso = entrada.next();
        return queso;
    }
    
    
    
    
}

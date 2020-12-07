
package Pizza;


public class Peperonni extends Pizza{

    public Peperonni() {
    }

    public Peperonni(String masa, String[] salsa, String[] ingredientes, int tamanio) {
        super(masa, salsa, ingredientes, tamanio);
        //opciones de peperoni
        //rodajas, rodajas y parmesano, rodajas y albaca, doble
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Rodajas";
        this.ingredientes[1] = "Rodajas con Parmesano";
        this.ingredientes[2] = "Rodajas y Albaca";
        this.ingredientes[4] = "Doble Peperoni en Rodajas";
        
    }
    
    
    
}

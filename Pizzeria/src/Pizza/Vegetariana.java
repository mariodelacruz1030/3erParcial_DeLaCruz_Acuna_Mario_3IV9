
package Pizza;


public class Vegetariana extends Pizza {

    public Vegetariana() {
    }

    public Vegetariana(String masa, String[] salsa, String[] ingredientes, int tamanio) {
        super(masa, salsa, ingredientes, tamanio);
        this.ingredientes = new String[4];
        this.ingredientes[0] = "Champiñones";
        this.ingredientes[1] = "Piña";
        this.ingredientes[2] = "Pimiento";
        this.ingredientes[3] = "Elote";
        
    }
    
    public Vegetariana(String masa){
        //aqui pueda modificar el comportamiento de la masa
    }

    
    
    
    
}
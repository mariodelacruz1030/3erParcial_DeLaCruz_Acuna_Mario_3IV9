
package Pizza;

import java.util.Scanner;


public class Pizza {
    
    private String masa;  //rellena de queso, crunch, con ajo
    private String[] salsa; //quiero una salva barbique, tomate, hiervas finas
    protected String[] ingredientes;
    protected int tamanio;
    
    private String tamanioP;
    
    //el scanner
    Scanner entrada = new Scanner(System.in);
    
    public Pizza(){
    }

    public Pizza(String masa, String[] salsa, String[] ingredientes, int tamanio) {
        this.masa = masa;
        this.salsa = salsa;
        this.ingredientes = ingredientes;
        this.tamanio = tamanio;
    }

    public Pizza(String tamanioP) {
        this.tamanioP = tamanioP;
    }
    
    //getter and setter

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public String[] getSalsa() {
        return salsa;
    }

    public void setSalsa(String[] salsa) {
        this.salsa = salsa;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }   
    
    //Eleccion del tamaño
    public int TamanioPizza(String tamanioP){
    
        if(tamanioP.equalsIgnoreCase("M")){
        tamanio = 4;
        }
        
        if(tamanioP.equalsIgnoreCase("G")){
        tamanio = 8;
        }
        
        if(tamanioP.equalsIgnoreCase("F")){
        tamanio = 12;
        }
        
        if(tamanioP.equalsIgnoreCase("EF")){
        tamanio = 16;
        }
        return tamanio;
    }
    
    public String ElegirTamanio(){
        
    
        do{
            System.out.println("Digame que tamanio de Pizza va a elegir");
            System.out.println("Escriba 'm' para mediano");
            System.out.println("Escriba 'g' para grande");
            System.out.println("Escriba 'f' para familar");
            System.out.println("Escriba 'ef' para extra-familiar");
            
            tamanioP = entrada.nextLine();
        
            if(! (tamanioP.equalsIgnoreCase("m") || tamanioP.equalsIgnoreCase("g") || tamanioP.equalsIgnoreCase("f") || tamanioP.equalsIgnoreCase("ef"))){
                System.out.println("Ese tamaño de pizza no existe, ingresalo de nuevo");
            }
            
        }while(! (tamanioP.equalsIgnoreCase("m") || tamanioP.equalsIgnoreCase("g") || tamanioP.equalsIgnoreCase("f") || tamanioP.equalsIgnoreCase("ef")));
        return tamanioP;
    }
    
    //operaciones propias
    public void hornear(){
        System.out.println("Honear la pizza toma 15 min");
    }
    
    public void cortar(){
        System.out.println("La pizza se corta en " + TamanioPizza(ElegirTamanio()) + " porciones");
    }
    
    public void empacar(){
        System.out.println("La pizza se empaca en una cajita de corazon");
    }
    
    
}

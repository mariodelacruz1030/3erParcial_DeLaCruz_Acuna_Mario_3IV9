
package PizzeriaMamaMia;

import Pizza.*;
import java.util.Scanner;

public class Menu {
    
        Scanner entrada_ = new Scanner(System.in);
        boolean cuenta = true;
        String otraPizza;
        int total;
        
        int opc;
        
        Pizza piza = null;
        
        public void MenuOperaciones(){
        
        Scanner entrada = new Scanner(System.in);
        
        
                
        do{
        
        System.out.println("¿Que desea ordenar?");
        System.out.println("1.- Pizza de Queso");
        System.out.println("2.- Pizza de Peperoni");
        System.out.println("3.- Pizza de Vegetariana");
        
        opc = entrada.nextInt();
        
        switch(opc){
            case 1:
                
                
                //polomorfismo
                piza = new Queso();
                
                //Aqui se ejecuta el pago total primero porque pregunta el tipo de queso
                //asi que no hay necesidad de preguntarlo aqui
                pagoTotal();
                //me pregunte que tipo de queso quiero?
                piza.cortar();
                piza.hornear();
                piza.empacar();
                
                
                
                cantidadPizzas();
                
                
                
                break;
            case 2:
                
                
                piza = new Peperonni();
                piza.cortar();
                piza.hornear();
                piza.empacar();
                pagoTotal();
                
                cantidadPizzas();
                
                break;
            case 3:
                
                
                piza = new Vegetariana();
                piza.cortar();
                piza.hornear();
                piza.empacar();
                pagoTotal();
                
                cantidadPizzas();
                break;
            default:
                System.out.println("No tenemos esa pizza, ingresala de nuevo");
            break;
        }
        
        }while(cuenta == true);
        
    }
        
    public void cantidadPizzas(){
    
        System.out.println("Desea ordenar otra pizza?");
        
        do{
        System.out.println("Presione 'enter' para ordenar otra pizza");
        System.out.println("Escriba 'x' para finalizar y obtener su cuenta total");
        
        otraPizza = entrada_.nextLine();
        
        if(otraPizza.equalsIgnoreCase("x")){
        cuenta = false;
        }else{
        if(otraPizza.equalsIgnoreCase("")){
            cuenta = true;
            }else{
                System.out.println("Opcion inexistente, ingresala de nuevo");
            }
        }
        
        
        
        }while(! (otraPizza.equalsIgnoreCase("") || otraPizza.equalsIgnoreCase("x")));
    }
    
    public void pagoTotal(){
      
        Queso qeso = new Queso();
        
        if(opc == 1){
            if("1".equals(qeso.elegirtipoqueso())){
                if(4==piza.getTamanio()){
                total += 89;
                }else{
                if(8==piza.getTamanio()){
                    total += 115;
                    }else{
                        if(12==piza.getTamanio()){
                            total += 135;
                        }else{
                            total += 175;
                        }
                    }
                }
            }else {
                if(4==piza.getTamanio()){
                total += 75;
                }else{
                if(8==piza.getTamanio()){
                    total += 89;
                    }else{
                        if(12==piza.getTamanio()){
                            total += 112;
                        }else{
                            total += 135;
                        }
                    }
                }
            }
        }
        
        if(opc == 2){
            if(4==piza.getTamanio()){
                total += 96;
            }else{
                if(8==piza.getTamanio()){
                    total += 119;
                }else{
                    if(12==piza.getTamanio()){
                        total += 131;
                    }else{
                        total += 167;
                        }
                    }
                }
        }
        
        if(opc == 3){
            if(4==piza.getTamanio()){
                total += 88;
            }else{
                if(8==piza.getTamanio()){
                    total += 97;
                }else{
                    if(12==piza.getTamanio()){
                        total += 111;
                    }else{
                        total += 157;
                    }
                }
            }
        }
        
    }
    
    
    public void mostrarTotal(){
    
        System.out.println();
        System.out.println("Su total a pagar es de:  $"+ total);
        System.out.println();
    }
    
}

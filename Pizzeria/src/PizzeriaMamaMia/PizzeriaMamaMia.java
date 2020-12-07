
package PizzeriaMamaMia;


public class PizzeriaMamaMia {

    public static void main(String[] args) {
        
        System.out.println("BIENVENIDO A LA PIZZERIA ");
        Menu men = new Menu();
        men.MenuOperaciones();
        men.mostrarTotal();
        
        System.out.println("GRACIAS POR VENIR");
    }
    
}

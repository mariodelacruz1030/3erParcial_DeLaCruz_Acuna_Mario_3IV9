
import java.io.FileNotFoundException;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Operaciones{
    
    ArrayList <Persona> listaPersonas = new ArrayList();
    
    String nombre;
    int edad;
    
    
    Persona persona = new Persona();
    
    public void menu() throws IOException, ClassNotFoundException{
        
        
        
        int opcion;
        do{
        opcion = Integer.parseInt(JOptionPane.showInputDialog("ArrayList de Personas con Serializacion \n"
        +"Que opcion vas a elegir? \n"
        +"\n1.- Agregar persona"
        +"\n2.- Eliminar persona"
        +"\n3.- Consultar lista personas"  
        +"\n4.- CERRAR"));
        
        switch (opcion){
        
            case 1:
                persona = new Persona(nombre, edad);
                registrarPersona();
                
                guardarPersona();
                break;
                
            case 2:
                break;
                
            case 3:
                leerPersona();
                break;
                
            case 4: 
                JOptionPane.showMessageDialog(null, "CERRANDO PROGRAMA", "POR FAVOR NO ME REPRUEBE unu", JOptionPane.INFORMATION_MESSAGE);
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "LA OCION INGRESADA NO EXISTE,\n INGRESALA DE NUEVO", "INEXISTENTE", JOptionPane.WARNING_MESSAGE);
                break;
        }
        
        }while(opcion != 4);
        
    }
    
    public void registrarPersona(){
        nombre = JOptionPane.showInputDialog("Ingresa el nombre de la persona");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad de la persona"));
        
    }
    
        public void guardarPersona() throws IOException {
        listaPersonas.add(persona = new Persona(nombre, edad));
        
        guardar();
    }
        
    private void leerPersona() throws IOException, ClassNotFoundException {
      
        FileInputStream archivo = new FileInputStream("archivo.dat");
        
        ObjectInputStream entrada = new ObjectInputStream(archivo);
        
        
        listaPersonas = (ArrayList)entrada.readObject();
        
        
        for(int i =0; i<listaPersonas.size(); i++){
            
            Persona obj = (Persona)listaPersonas.get(i); 
            
            JOptionPane.showMessageDialog(null, "Datos de la persona:"
                    + "\n Nombre :" + obj.getNombre()+ "\n"
                    + "\n Edad :" + obj.getEdad()+ "\n"
                    + "\n ID :" + listaPersonas.size());
        }
    }
    
    
        public void guardar() throws FileNotFoundException, IOException{
        
        FileOutputStream archivo = new FileOutputStream("archivo.dat");
       
        ObjectOutputStream salida = new ObjectOutputStream(archivo);
        
        salida.writeObject(listaPersonas);
        salida.close();
     }
    
}

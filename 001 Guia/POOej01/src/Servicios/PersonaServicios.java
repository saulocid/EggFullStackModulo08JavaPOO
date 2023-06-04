package Servicios;

import Entidades.Persona;
import java.util.Scanner;

public class PersonaServicios {
    
    static final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        
        Persona per = new Persona();
        
            System.out.print("Ingrese el nombre: ");
            per.setNombre(leer.next());
            System.out.print("Ingrese la edad: ");
            per.setEdad(leer.nextInt());
            System.out.print("Ingrese el país: ");
            per.setPais(leer.next());
        
        return per;
        
    }
    
    public void mostrarPersona(Persona per){
        
        System.out.println("Nombre: " + per.getNombre());
        System.out.println("Edad: " + per.getEdad());
        System.out.println("País: " + per.getPais());
        
    }
    
}

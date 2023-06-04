package ej07;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Ej07 {

    public static void main(String[] args) {
       
        PersonaServicio ps = new PersonaServicio();
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        
        Persona[] persona = {p1, p2, p3, p4};
        
        System.out.println("");
        for (int i = 0; i < persona.length; i++) {
            System.out.println("Ingrese datos para la persona Nº " + (i+1));
            persona[i]=ps.crearPersona();
        }
        System.out.println("");
        
        for (int i = 0; i < persona.length; i++) {
            System.out.println("Datos persona Nº " + (i+1));
            validacion(persona[i], ps);
            System.out.println("");
        }

    }
    
    public static void validacion(Persona per, PersonaServicio ps){
        
        int valor;
        valor = ps.calcularIMC(per);
        
        switch(valor){
            case -1:
                System.out.println("Estás por debajo del peso ideal");
                break;
            case 1:
                System.out.println("Estás por encima del peso ideal");
                break;
            default:
                System.out.println("ESTÁS EN EL PESO IDEAL!!!");
        }
        
        ps.esMayorDeEdad(per);
        
    }

}
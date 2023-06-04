package ej12;

import Entidades.Persona;
import Servicios.ServicioPersona;

public class Ej12 {

    public static void main(String[] args) {

        ServicioPersona sp = new ServicioPersona();
        Persona per = sp.crearPersona();
        int edad = sp.calcularEdad(per);
        System.out.println("La persona tiene " + edad + " años.");
        Persona per2 = sp.crearPersona();
        edad = sp.calcularEdad(per2);
        System.out.println("La persona tiene " + edad + " años.");
        if (sp.menorQue(per2, per) == true) System.out.println("La nueva edad ingresada es Menor que " + per.getNombre());
        else System.out.println("La edad ingresada no es menor que " + per.getNombre());
        System.out.println("Persona 1");
        sp.mostrar(per);
        System.out.println("Persona 2");
        sp.mostrar(per2);
        
    }

}
    
    



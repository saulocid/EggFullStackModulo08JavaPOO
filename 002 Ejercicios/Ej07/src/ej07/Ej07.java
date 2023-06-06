package ej07;

import Entidades.Persona;
import Servicios.PersonaServicio;

public class Ej07 {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();

        Persona[] persona = new Persona[4];
        int[] contImc = {0, 0, 0};
        int[] contEdad = {0, 0};

        System.out.println("");
        for (int i = 0; i < persona.length; i++) {
            System.out.println("Ingrese datos para la persona Nº " + (i + 1));
            persona[i] = ps.crearPersona();
        }
        System.out.println("");

        for (int i = 0; i < persona.length; i++) {
            System.out.println("Datos persona Nº " + (i + 1));
            validacion(persona[i], ps, contImc);
            ps.esMayorDeEdad(persona[i], contEdad);
            System.out.println("");
        }

        ps.mostrarPorcentajes(contEdad, contImc);
        

    }

    public static void validacion(Persona per, PersonaServicio ps, int[] contadorImc) {

        int valor;
        valor = ps.calcularIMC(per);

        switch (valor) {
            case -1:
                contadorImc[0]++;
                System.out.println("Estás por debajo del peso ideal");
                break;
            case 1:
                contadorImc[2]++;
                System.out.println("Estás por encima del peso ideal");
                break;
            default:
                contadorImc[1]++;
                System.out.println("ESTÁS EN EL PESO IDEAL!!!");
        }

    }

}

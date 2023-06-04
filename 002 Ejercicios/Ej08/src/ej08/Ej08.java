package ej08;

import Entidades.Cadena;
import Servicios.CadenaServicio;
import java.util.Scanner;

public class Ej08 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CadenaServicio cs = new CadenaServicio();
        Cadena cadena = cs.pedirFrase();

        char[] vector = new char[cadena.getLongitud()];
        vector = cs.llenarVector(vector, cadena);
        System.out.println("La cantidad de vocales son " + cs.mostrarVocales(vector, cadena));
        cs.invertirFrase(vector, cadena);
        System.out.println("El caracter se encontró " + cs.vecesRepetido(vector, cadena) + " veces.");
        cs.compararLongitud(cadena);
        cs.unirFrases(cadena);
        cs.reemplazar(cadena);
        vector = cs.llenarVector(vector, cadena);
        if (cs.contiene(vector, cadena)==true) System.out.println("Sí contiene el caracter.");
        else System.out.println("No contiene el caracter");
    }

}

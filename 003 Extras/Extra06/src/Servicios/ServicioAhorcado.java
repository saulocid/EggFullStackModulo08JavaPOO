package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class ServicioAhorcado {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Ahorcado crearJuego() {

        System.out.print("Ingrese la palabra a adivinar: ");
        String palabra = leer.next().toUpperCase();
        String[] vector = new String[palabra.length()];
        String[] vectorEspejo = new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            if (i < palabra.length() - 1) {
                vector[i] = palabra.substring(0 + i, 1 + i);
            } else {
                vector[i] = palabra.substring(i);
            }
            vectorEspejo[i] = "_";
        }
        for (int i = 0; i < 30; i++) {
            System.out.println("");
        }

        int jugMax;
        do {
            System.out.print("Ingrese la cantidad de intentos máximo: ");
            jugMax = leer.nextInt();
            if (jugMax < 1) {
                System.out.println("Error!");
            }
        } while (jugMax < 1);

        System.out.println("La palabra tiene " + palabra.length() + " letras.");
        Ahorcado juego = new Ahorcado(vector, vectorEspejo, 0, jugMax, "");
        return juego;
    }

    public int longitud(Ahorcado juego) {
        int longi = juego.getBuscar().length;
        return longi;
    }

    public void buscar(Ahorcado juego, int cont) {
        juego.setEncontradas(juego.getEncontradas() + cont);
        if (cont > 0) {
            System.out.println("La letra es parte de la palabra.");
            System.out.println("Se encontró " + cont + " veces.");
        } else {
            System.out.println("La letra no es parte de la palabra");
        }
    }

    public boolean encontradas(Ahorcado juego) {
        String[] vec = juego.getBuscar();
        String[] vec2 = juego.getEspejo();
        int cont = 0;
        boolean band = false, b = false;
        System.out.println("-----------------------------");
        System.out.print("Ingrese letra: ");
        String letra = leer.next().toUpperCase();
        for (int i = 0; i < longitud(juego); i++) {
            if (letra.equals(vec[i])) {
                if(juego.getAcumulador().contains(Character.toString(letra.charAt(0)))){
                    b=true;
                }
                if (b == false) {
                    cont++;
                    band = true;
                } else {
                    System.out.println("LA LETRA YA FUE USADA! Se le descontará una oportunidad.");
                }
                vec2[i] = letra;
            }
        }
        juego.setAcumulador(juego.getAcumulador() + letra);
        juego.setEspejo(vec2);
        buscar(juego, cont);
        return band;
    }

    public void intentos(Ahorcado juego) {
        if (encontradas(juego) == false) {
            juego.setJugadasMax(juego.getJugadasMax() - 1);
        }
        System.out.println("Encontradas: " + juego.getEncontradas() + ", faltantes: " + (longitud(juego) - juego.getEncontradas()));
        System.out.println("Quedan " + juego.getJugadasMax() + " intentos");
        System.out.println("-----------------------------");
        System.out.println("Letras usadas: " + juego.getAcumulador());
        String[] vec = juego.getEspejo();
        for (int i = 0; i < longitud(juego); i++) {
            System.out.print(vec[i]);
        }
        System.out.println("");
    }

    public void juego(Ahorcado juego) {
        do {
            intentos(juego);
        } while (juego.getJugadasMax() > 0 && juego.getEncontradas() != longitud(juego));
        String[] vec = juego.getBuscar();
        System.out.print("La palabra es ");
        for (int i = 0; i < longitud(juego); i++) {
            System.out.print(vec[i]);
        }
        System.out.println("");
        if (juego.getJugadasMax() == 0) {
            System.out.println("HAS PERDIDO!!!! La próxima tendás más suerte =D ");
        } else {
            System.out.println("HAS GANADO!!! Enorabuena tío!");
        }
    }

}

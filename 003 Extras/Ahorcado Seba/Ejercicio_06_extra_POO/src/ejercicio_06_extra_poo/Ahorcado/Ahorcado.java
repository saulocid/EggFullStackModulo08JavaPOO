/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_06_extra_poo.Ahorcado;

import java.util.*;



public class Ahorcado {
    private char[] palabra;
    private boolean[] letrasEncontradas;
    private int jugadasMaximas;
    private int oportunidades;
    private String Aux;

    public Ahorcado() {
    }

    public char[] getPalabra() {
        return palabra;
    }

    public boolean[] getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setAux(String Aux) {
        this.Aux = Aux;
    }

    public String getAux() {
        return Aux;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setPalabra(char[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEncontradas(boolean[] letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }

    public Ahorcado(String palabra, int jugadasMaximas) {
        this.palabra = palabra.toCharArray();
        this.letrasEncontradas = new boolean[palabra.length()];
        this.jugadasMaximas = jugadasMaximas;
        this.oportunidades = jugadasMaximas;
    }

    public void crearJuego() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la palabra: ");
        String palabra = scanner.nextLine();
        Aux=palabra;
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        System.out.println("<---------------------------------------------->");
        this.palabra = palabra.toCharArray();
        this.letrasEncontradas = new boolean[palabra.length()];
        System.out.print("Ingrese la cantidad de jugadas: ");
        this.jugadasMaximas = scanner.nextInt();
        this.oportunidades = this.jugadasMaximas;
    }
    
    
    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    public boolean buscar(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                encontrada = true;
                letrasEncontradas[i] = true;
            }
        }
        if (encontrada) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
            oportunidades--;
        }
        return encontrada;
    }

    public void encontradas(char letra) {
        int letrasFaltantes = palabra.length - contarLetrasEncontradas();
        System.out.println("Número de letras (encontradas, faltantes): (" + contarLetrasEncontradas() + "," + letrasFaltantes + ")");
        System.out.print("Palabra: ");
        for (int i = 0; i < palabra.length; i++) {
            if (letrasEncontradas[i]) {
                System.out.print(palabra[i]);
            } else {
                System.out.print("_");
            }
        }
        System.out.println();
    }

    public int contarLetrasEncontradas() {
        int contador = 0;
        for (boolean encontrada : letrasEncontradas) {
            if (encontrada) {
                contador++;
            }
        }
        return contador;
    }

    public void intentos() {
        System.out.println("Número de oportunidades restantes: " + oportunidades);
    }

    public void juego(Ahorcado palabra1) {
        Scanner scanner = new Scanner(System.in);
        while (contarLetrasEncontradas() < palabra.length && oportunidades > 0) {
            System.out.print("Ingrese una letra: ");
            char letra = scanner.next().charAt(0);
            buscar(letra);
            encontradas(letra);
            intentos();
            System.out.println("<---------------------------------------------->");
        }
        if (contarLetrasEncontradas() == palabra.length) {
            System.out.println("¡Felicidades! Has adivinado la palabra.");
        } else {
            System.out.println("Lo sentimos, no hay más oportunidades.");
            System.out.println("la palabra es: " + palabra1.getAux());
            System.out.println("<---------------------------------------------->");
            System.out.println("ERES UNA DESHONRA PARA TU FAMILIA Y TU VACA, Y TU GATO NO TE QUIERE.");
            System.out.println("<---------------------------------------------->");
        }
    }
    
    public boolean salir(){
        boolean salir = false;
        int num;
        Scanner respuesta = new Scanner(System.in);
        
        do{
        System.out.println("<---------------------------------------------->");
        System.out.println("Elije una de las siguientes opciones");
        System.out.println("1. Para reiniciar");
        System.out.println("2. Para salir");
        System.out.print("Respuesta: ");
        num = respuesta.nextInt();
        
        }while (num < 1 || num > 2);
        if (num == 2){
            salir = false;
        }else salir = true;
        return salir;
        
    }
}
            


 


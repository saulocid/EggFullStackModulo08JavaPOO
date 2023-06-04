package Entidades;

import java.util.Scanner;

public class Libro {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public int ISBN;
    public String titulo;
    public String autor;
    public int numPag;

    public Libro() {
        
    }
    
    public Libro(int ISBN, String titulo, String autor, int numPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
    
    public void cargarDatos(Libro lib){
        
        System.out.println("");
        System.out.print("Ingrese ISBN del libro: ");
        lib.ISBN = leer.nextInt();
        System.out.print("Ingrese título del libro: ");
        lib.titulo = leer.next();
        System.out.print("Ingrese autor del libro: ");
        lib.autor = leer.next();
        System.out.print("Ingrese cantidad de páginas: ");
        lib.numPag = leer.nextInt();
        System.out.println("");

    }
    
    public void mostrarDatos(Libro lib){
        
        System.out.println("El ISBN es: " + lib.ISBN);
        System.out.println("El título es: " + lib.titulo);
        System.out.println("El autor es: " + lib.autor);
        System.out.println("La cantidad de páginas son: " + lib.numPag);
        System.out.println("");
        
    }
    
}

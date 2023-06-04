package Servicios;

import Entidades.Movil;
import java.util.Scanner;

/* Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.

 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo */

public class MovilServicio {
    
    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Movil cargarCelular(){
        
        //marca, precio, modelo, memoriaRam, almacenamiento y codigo[7]
        Movil m = new Movil();
        
        System.out.print("Ingrese marca: ");
        m.setMarca(leer.next());
        
        System.out.print("Ingrese precio: ");
        m.setPrecio(leer.nextInt());
        
        System.out.print("Ingrese modelo: ");
        m.setModelo(leer.next());
        
        System.out.print("Cantidad memoria ram: ");
        m.setMemoriaRam(leer.nextInt());
        
        System.out.print("Cantidad almacenamiento: ");
        m.setAlmacenamiento(leer.nextInt());
        
        System.out.println("Ingrese el codigo: ");
        m.setCodigo(ingresarCodigo(m));
        
        return m;
    }
    
    public int[] ingresarCodigo(Movil m){
        int[] vec = new int[7];
        for (int i = 0; i < 7; i++) {
            do { 
                System.out.print("Caracter " + (i+1) + ": ");
                vec[i]=leer.nextInt();
                if(vec[i]<0 || vec[i]>9) System.out.println("Ingrese de a un digito numerico");
            } while (vec[i]<0 || vec[i]>9);
        }
        return vec;
    }
    
    public void mostrarMovil(Movil m){
        System.out.print("Su móvil es un " + m.getMarca() + ", con un valor de $" + m.getPrecio() + ", modelo " + m.getModelo() + ", con " + m.getMemoriaRam() + "Gb de memoria RAM, " + m.getAlmacenamiento() + "GB de almacenamiento y su código es:");
        mostrarCodigo(m);
    }
    
    public void mostrarCodigo(Movil m){
        int[] vec = m.getCodigo();
        for (int i = 0; i < 7; i++) {
            System.out.print(vec[i] + " ");
        }
        System.out.println("");
    }
            
    
}

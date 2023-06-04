package Servicios;

import Entidades.Arreglo;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20. */
public class ServicioArreglo {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Arreglo iniciarArreglo() {
        Arreglo ar = new Arreglo();
        
        iniciarA(ar);
        iniciarB(ar);

        return ar;
    }

    public static void iniciarA(Arreglo ar) {
        double[] vec = ar.getA();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            vec[i] = random.nextInt(100);
        }
        System.out.println("El Arreglo A es:");
        System.out.println(Arrays.toString(ar.getA()));

        ar.setA(vec);
    }

    public static void iniciarB(Arreglo ar) {
        double[] vec = ar.getB();

        for (int i = 0; i < 20; i++) {
            vec[i] = 0.5;
        }

        ar.setB(vec);
    }
    
    public void ordenarA(Arreglo ar){
        double[] vec1 = ar.getA();
        double[] vec2 = ar.getB();
        Arrays.sort(vec1);
        for (int i = 0; i < 10; i++) {
            vec2[i]=vec1[i];
        }
        ar.setA(vec1);
        ar.setB(vec2);
    }
    
    public void mostrar(Arreglo ar){
        System.out.println("Los arreglos modificados son:");
        System.out.println("Arreglo 1: " + Arrays.toString(ar.getA()));
        System.out.println("Arreglo 2: " + Arrays.toString(ar.getB()));
    }
    

}

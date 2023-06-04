package Servicios;

import Entidades.Matematica;
import java.util.Scanner;

/* Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. */
public class ServicioMatematica {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Matematica crearObjeto() {
        Matematica mat = new Matematica();

        System.out.println("Ingrese 2 valores numéricos para operar");
        System.out.print("Nº 1: ");
        mat.setNum1(leer.nextDouble());
        System.out.print("Nº 2: ");
        mat.setNum2(leer.nextDouble());

        return mat;
    }

    public void devolverMayor(Matematica mat) {
        if (mat.getNum1() == mat.getNum2()) {
            System.out.println("Los números " + mat.getNum1() + " son iguales!!");
        } else if (mat.getNum1() > mat.getNum2()) {
            System.out.println(mat.getNum1() + " es el mayor.");
        } else {
            System.out.println(mat.getNum2() + " es el mayor.");
        }
    }

    public int[] mayorMenor(Matematica mat) {

        int mayor = 0, menor = 0;
        int[] numeros = {mayor, menor};

        if (mat.getNum1() == mat.getNum2()) {
            numeros[0] = (int) Math.round(mat.getNum1());
            numeros[1] = (int) Math.round(mat.getNum1());
        } else if (mat.getNum1() > mat.getNum2()) {
            numeros[0] = (int) Math.round(mat.getNum1());
            numeros[1] = (int) Math.round(mat.getNum2());
        } else {
            numeros[0] = (int) Math.round(mat.getNum2());
            numeros[1] = (int) Math.round(mat.getNum1());
        }
        
        return numeros;
    }
    
    public double calcularPotencia(Matematica mat){
        int[] vec = mayorMenor(mat);
        double potencia = Math.pow(vec[0], vec[1]);
        return potencia;
    }
    
    public double calcularRaiz(Matematica mat){
        int[] vec = mayorMenor(mat);
        double raiz = Math.sqrt(vec[1]);
        return raiz;
    }

}

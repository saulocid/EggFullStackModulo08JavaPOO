package ej09;

import Entidades.Matematica;
import Servicios.ServicioMatematica;

public class Ej09 {

    public static void main(String[] args) {
        
        ServicioMatematica sm = new ServicioMatematica();
        Matematica mat1 = sm.crearObjeto();
        sm.devolverMayor(mat1);
        int[] vec = sm.mayorMenor(mat1);
        System.out.println("La potencia de " + vec[0] + " elevado a " + vec[1] + " es " + sm.calcularPotencia(mat1));
        System.out.println("La raíz cuadrada de " + vec[1] + " es " + sm.calcularRaiz(mat1));
        
    }
        
}
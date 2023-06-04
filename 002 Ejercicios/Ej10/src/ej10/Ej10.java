package ej10;

import Entidades.Arreglo;
import Servicios.ServicioArreglo;

public class Ej10 {

    public static void main(String[] args) {
       
        ServicioArreglo sa = new ServicioArreglo(); 
        Arreglo ar = sa.iniciarArreglo();
        sa.ordenarA(ar);
        sa.mostrar(ar);
    }

}
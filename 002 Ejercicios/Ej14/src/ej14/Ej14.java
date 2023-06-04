package ej14;

import Entidades.Movil;
import Servicios.MovilServicio;

public class Ej14 {

    public static void main(String[] args) {
       
        MovilServicio ms = new MovilServicio();
        Movil m = ms.cargarCelular();
        ms.mostrarMovil(m);

    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AhorcadoMain;

import ejercicio_06_extra_poo.Ahorcado.Ahorcado;

public class AhorcadoMain {


    public static void main(String[] args) {
        
        boolean opcion;
        
        do{
        Ahorcado ahorcado = new Ahorcado();
        ahorcado.crearJuego();
        ahorcado.longitud();
        ahorcado.juego(ahorcado);
        
       
        opcion = ahorcado.salir();
        }while (opcion==true);
    }
}
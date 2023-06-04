package ej11;

import java.util.Calendar;
//import java.util.Date;
import java.util.Scanner;

/* Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date(); */

//Clase Date OBSOLETO!!! usar Calendar en su lugar.

public class Ej11 {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        int dia, mes, anio;
        
        System.out.print("Ingrese su día de nacimiento: ");
        dia = leer.nextInt();
        System.out.print("Ingrese su mes de nacimiento: ");
        mes = leer.nextInt();
        System.out.print("Ingrese su año de nacimiento: ");
        anio = leer.nextInt();
        
        
        /* Date fechaNacimiento = new Date(dia, mes, anio);
        Date fechaActual = new Date();
        
        System.out.println(fechaActual);
        System.out.println(fechaNacimiento);

        La biblioteca Date esta OBSOLETA y se usa Calendar en su lugar*/
        
        Calendar fechaNacimiento = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();
        fechaNacimiento.set(anio, mes - 1, dia);
        
        System.out.println("Fecha actual: " + fechaActual.getTime());
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.getTime());

        int YEAR = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        System.out.println("La diferencia de años es " + YEAR);
        
    }

}
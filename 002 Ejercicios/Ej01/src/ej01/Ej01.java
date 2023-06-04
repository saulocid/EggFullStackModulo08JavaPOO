package ej01;

import Entidades.Libro;

/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas. */

public class Ej01 {

    public static void main(String[] args) {

        //creamos el objeto tipo Libro
        Libro libro1 = new Libro();
        
        
        System.out.println("A continuación ingrese los datos del nuevo libro");
        //llenamos sus atributos
        libro1.cargarDatos(libro1);
        
        //mostramos por pantalla el objeto
        libro1.mostrarDatos(libro1);

    }

}
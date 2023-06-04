package ej04;

import Entidades.Rectangulo;

/* Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2. */

public class Ej04 {

    public static void main(String[] args) {
       
        Rectangulo rec = new Rectangulo();
        
        System.out.println("Ingrese los siguientes datos para crear un rectángulo y operar con él");
        System.out.println("");
        
        rec.crearRectangulo(0,0);
        
        System.out.println("Su superficie es: " + rec.superficie(rec.getBase(), rec.getAltura()));
        System.out.println("");
        
        System.out.println("Su perímetro es: " + rec.perimetro(rec.getBase(), rec.getAltura()));
        System.out.println("");

        rec.dibujar(rec.getBase(), rec.getAltura());

    }

}
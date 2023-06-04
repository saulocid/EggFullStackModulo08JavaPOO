package ej02;

import Entidades.Circunferencia;

/* Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = pi * radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 * pi * radio).*/


public class Ej02 {

    public static void main(String[] args) {
       
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        System.out.println(c1.area(c1.getRadio()));
        System.out.println(c1.perimetro(c1.getRadio()));
        
    }

}
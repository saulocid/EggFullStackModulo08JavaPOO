package ej03;

import Entidades.Operacion;

/* Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main
g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main. */


public class Ej03 {

    public static void main(String[] args) {
       
        Operacion op1 = new Operacion();
        
        System.out.println("");
        op1.crearOperacion(0,0);
        System.out.println("Sus números son " + op1.getNum1() + " y " + op1.getNum2());
        System.out.println("");
        System.out.println("La suma es " + op1.sumar(op1.getNum1(),op1.getNum2()));
        System.out.println("");
        System.out.println("La resta es " + op1.restar(op1.getNum1(),op1.getNum2()));
        System.out.println("");
        System.out.println("La multiplicación es " + op1.multiplicar(op1.getNum1(),op1.getNum2()));
        System.out.println("");
        System.out.println("La división es " + op1.dividir(op1.getNum1(),op1.getNum2()));
        System.out.println("");

    }

}
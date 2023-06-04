package Entidades;

import java.util.Scanner;

public class Operacion {
    
    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double num1;
    private double num2;

    public Operacion() {
    }

    public Operacion(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(double num1, double num2){
        System.out.println("Ingrese primer número: ");
        setNum1(leer.nextInt());
        System.out.println("Ingrese Segundo número: ");
        setNum2(leer.nextInt());
        System.out.println("");
    }

    public void crearOperacion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double sumar(double num1, double num2){
        return num1 + num2;
    }
    
    public double restar(double num1, double num2){
        return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2){
        if(num1==0 || num2==0){
            System.out.println("Error al multiplicar por 0");
            return 0;
        } else return num1 * num2;
    }
    
    public double dividir(double num1, double num2){
        if (num2==0){
            System.out.println("Error al dividir por 0");
            return 0;
        } else return (double) num1 / num2;
    }
    
}

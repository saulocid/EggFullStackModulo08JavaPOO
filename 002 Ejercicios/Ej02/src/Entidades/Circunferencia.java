package Entidades;

import java.util.Scanner;

public class Circunferencia {
    
    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public void crearCircunferencia(){
        System.out.print("Ingrese el radio: ");
        setRadio(leer.nextDouble());
    }
    
    public double area(double radio){
        System.out.println("El Área es:");
        return Math.PI * Math.pow(radio,2);
    }
    
    public double perimetro(double radio){
        System.out.println("El perímetro es:");
        return 2 * Math.PI * radio;
    }
    
}

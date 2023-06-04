
package Entidades;

import java.util.Scanner;

public class Rectangulo {
    
    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearRectangulo(double base, double altura){
        System.out.println("A continuación crearemos el rectángulo.");
        System.out.print("Ingrese la base: ");
        setBase(leer.nextDouble());
        System.out.print("Ingrese la altura: ");
        setAltura(leer.nextDouble());
        System.out.println("");
    }
    
    public double superficie(double base, double altura){
        return base*altura;
    }
    
    public double perimetro(double base, double altura){
        return 2*(base+altura);
    }
    
    public void dibujar(double base, double altura){
        
        System.out.println("El rectángulo dibujado es:");
        System.out.println("");
        for (int i = 0; i < altura; i++) {
            
            for (int j = 0; j < base; j++) {
                
                if (i==0 || i==altura-1){
                    System.out.print("* ");
                } else if (j==0 || j==base-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            } 
            System.out.println("");
        }
        System.out.println("");
    }
    
}

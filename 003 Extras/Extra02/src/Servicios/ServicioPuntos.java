package Servicios;

import Entidades.Puntos;
import java.util.Scanner;

public class ServicioPuntos {
    
    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Puntos crearPuntos(){
        
        Puntos p = new Puntos();
        
        System.out.println("calcularemos 2 puntos en el plano");
        System.out.println("Ingrese valores de -9 a 9");
        System.out.println("");
        
        System.out.print("Punto 1 valor X: ");
        p.setX1(validarPunto(p));
        System.out.print("Punto 1 valor Y: ");
        p.setY1(validarPunto(p));
        System.out.print("Punto 2 valor X: ");
        p.setX2(validarPunto(p));
        System.out.print("Punto 2 valor Y: ");
        p.setY2(validarPunto(p));
        
        return p;
    }
    
    public double validarPunto(Puntos p){
        
        double punto;
        do {            
            punto = leer.nextDouble();
            if(punto<-9||punto>9) System.out.print("Valor erróneo, vuelva a ingresar: ");
        } while (punto<-9||punto>9);
        System.out.println("");
        return punto;
        
    }
    
    public double distancia(Puntos p){
        //√(x2-x1)2+(y2-y1)2
        double distancia = Math.sqrt(Math.pow(p.getX2()-p.getX1(),2)+(Math.pow(p.getY2()-p.getY1(), 2)));
        return distancia;
    }
    
}

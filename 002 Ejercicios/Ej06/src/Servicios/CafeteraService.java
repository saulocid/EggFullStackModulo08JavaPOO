package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

/* Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada. */

public class CafeteraService {
    
    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public  Cafetera llenarCafetera(){
        
        Cafetera caf =  new Cafetera();
        
        System.out.println("");
        System.out.print("Ingrese la capacidad máxima de la cafetera en cc: ");
        caf.setCapacidadMaxima(leer.nextDouble());
        caf.setCapacidadActual(caf.getCapacidadMaxima());
        System.out.println("");
        
        return caf;
    }
    
    public void servirTaza(Cafetera caf){
        
        System.out.print("Ingrese la cantidad a servir en cc: ");
        double servir = leer.nextDouble();
        if(caf.getCapacidadActual()>=servir){
            caf.setCapacidadActual(caf.getCapacidadActual()-servir);
            System.out.println("Queda en la cafetera " + caf.getCapacidadActual() + " cc de café.");
        } else {
            System.out.println("No alcanzamos a servir la taza completa.");
            System.out.println("Se le sirvió " + caf.getCapacidadActual() + " cc de café.");
            caf.setCapacidadActual(0);
        }
        
    }
    
    public void vaciarCafetera(Cafetera caf){
        caf.setCapacidadActual(0);
    }
    
    public void agregarCafe(Cafetera caf){
        System.out.print("Ingrese la cantidad en cc de café a agregar a la cafetera: ");
        double cant = leer.nextDouble();
        if (cant>(caf.getCapacidadMaxima()-caf.getCapacidadActual())){
            System.out.println("La cantidad supera la cafetera, se añadirá café hasta que la misma se llene");
            caf.setCapacidadActual(caf.getCapacidadMaxima());
        } else {
            caf.setCapacidadActual(caf.getCapacidadActual()+cant);
        }
    }
    
}

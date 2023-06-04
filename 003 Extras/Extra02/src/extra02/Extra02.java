package extra02;

import Entidades.Puntos;
import Servicios.ServicioPuntos;

public class Extra02 {

    public static void main(String[] args) {
       
        ServicioPuntos sp = new ServicioPuntos();
        Puntos p = sp.crearPuntos();
        System.out.println("La distancia entre el punto " + p.getX1() + "," + p.getY1()+ " y " + p.getX2() + "," + p.getY2() + " es de " + sp.distancia(p));

    }

}
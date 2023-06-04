package extra06;

import Entidades.Ahorcado;
import Servicios.ServicioAhorcado;

public class Extra06 {

    public static void main(String[] args) {
       
        ServicioAhorcado sa = new ServicioAhorcado();
        Ahorcado juego = sa.crearJuego();
        sa.juego(juego);

    }

}
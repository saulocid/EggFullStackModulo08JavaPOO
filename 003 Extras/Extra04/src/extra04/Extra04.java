package extra04;

import Entidades.NIF;
import Servicios.ServicioNIF;

public class Extra04 {

    public static void main(String[] args) {
       
        ServicioNIF snif = new ServicioNIF();
        NIF nif = snif.crearNIF();
        snif.mostrar(nif);

    }

}
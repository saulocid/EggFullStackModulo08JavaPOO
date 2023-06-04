package extra03;

import Entidades.Raices;
import Servicios.ServicioRaices;

public class Extra03 {
    
    public static void main(String[] args) {
        
        ServicioRaices SR = new ServicioRaices();
        Raices R = SR.crearRaices();
        SR.calcular(R);
    }
    
}

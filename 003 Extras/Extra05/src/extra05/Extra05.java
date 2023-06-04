package extra05;

import Entidades.MesSecreto;
import Servicios.ServicioMesSecreto;

public class Extra05 {

    public static void main(String[] args) {
       
        ServicioMesSecreto sms = new ServicioMesSecreto();
        MesSecreto ms = sms.crearMes(); 
        sms.pedirMes(ms);

    }

}
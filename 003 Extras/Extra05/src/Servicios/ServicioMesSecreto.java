package Servicios;

import Entidades.MesSecreto;
import java.util.Random;
import java.util.Scanner;

public class ServicioMesSecreto {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public final Random random = new Random();

    public MesSecreto crearMes() {
        MesSecreto mess = new MesSecreto();
        String[] vec = mess.getMes();
        int ran = random.nextInt(12);
        mess.setMesSecreto(vec[ran]);
        return mess;
    }

    public void pedirMes(MesSecreto mess) {
        System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
        String opc;
        int band = 0;
        do {
            opc = leer.next().toLowerCase();

            if (opc.equals(mess.getMesSecreto())) {
                System.out.println("¡Ha acertado!");
                band = 1;
            } else {
                System.out.print("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
        } while (band == 0);
    }

}

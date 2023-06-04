package Servicios;

import Entidades.NIF;
import java.util.Scanner;

public class ServicioNIF {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public NIF crearNIF() {
        NIF nif = new NIF();
        System.out.print("Ingrese su dni: ");
        do {
            nif.setDNI(leer.nextLong());
            if (nif.getDNI() < 3000000 || nif.getDNI() > 99000000) {
                System.out.print("DNI erróneo, vuelva a ingresar: ");
            }
        } while (nif.getDNI() < 3000000 || nif.getDNI() > 99000000);
        nif.setLetra(calcularLetra(nif));
        return nif;
    }

    public String calcularLetra(NIF nif) {
        String letra = "";
        String[] vec = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int res = (int) nif.getDNI() % 23;
        letra = vec[res];
        return letra;
    }
    
    public void mostrar(NIF nif){
        System.out.println("El NIF es: " + nif.getDNI() + "-" + nif.getLetra());
    }

}

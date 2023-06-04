package ej06;

import Entidades.Cafetera;
import Servicios.CafeteraService;
import java.util.Scanner;

public class Ej06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        CafeteraService cs = new CafeteraService();

        Cafetera caf1 = cs.llenarCafetera();

        int opc;

        do {
            do {
                System.out.println("*************************************");
                System.out.println("* Ingrese una opcion númerica para: *");
                System.out.println("* 1. Servir taza                    *");
                System.out.println("* 2. Agregar café a la cafetera     *");
                System.out.println("* 3. Vaciar cafetera                *");
                System.out.println("* 4. Salir del programa             *");
                System.out.println("*************************************");
                System.out.print("Ingrese opción: ");
                opc = leer.nextInt();
                if (opc < 1 || opc > 5) {
                    System.out.println("Valor incorrecto, vuelva a ingresar");
                }
                System.out.println("");
            } while (opc < 1 || opc > 4);

            switch (opc) {
                case 1:
                    cs.servirTaza(caf1);
                    break;
                case 2:
                    cs.agregarCafe(caf1);
                    break;
                case 3:
                    cs.vaciarCafetera(caf1);
                default:
                    System.out.println("Usted a elegido salir del programa");
            }

        } while (opc != 4);

    }

}

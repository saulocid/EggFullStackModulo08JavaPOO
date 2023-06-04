package Servicios;

import Entidades.CuentaBancaria;
import java.util.Scanner;

public class ServicioCuentaBancaria {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {

        CuentaBancaria cb = new CuentaBancaria();

        System.out.println("Ingrese los datos de su cuenta bancaria");
        System.out.print("Ingrese el número de cuenta: Nº");
        cb.setNumeroCuenta(leer.nextInt());
        System.out.print("Ingrese su DNI: ");
        cb.setDni(leer.nextLong());
        System.out.print("Ingrese su saldo actual: $");
        cb.setSaldoActual(leer.nextInt());

        return cb;

    }

    public void ingreso(double ingreso, CuentaBancaria cb) {

        System.out.print("Coloque monto a sumar: $");
        cb.setSaldoActual(cb.getSaldoActual() + ((int)leer.nextDouble()));
       
    }

    public void retiro(double ingreso, CuentaBancaria cb) {

        System.out.print("coloque monto a restar: $");
        ingreso = leer.nextDouble();
        if (cb.getSaldoActual() < ingreso) {
            cb.setSaldoActual(0);
        } else {
            cb.setSaldoActual(cb.getSaldoActual() - ((int)ingreso));
        }
    }

    public void extraccion(double ingreso, CuentaBancaria cb) {

        do {
            System.out.print("Coloque monto a retirar: $");
            ingreso = leer.nextDouble();
            if(ingreso<=((double)cb.getSaldoActual()*0.2)){
                cb.setSaldoActual(cb.getSaldoActual()-((int)ingreso));
                break;
            } else System.out.println("Supera el 20%, vuelva a ingresar monto");
        } while (ingreso>((double)cb.getSaldoActual()*0.2));

    }
    
    public void saldo(CuentaBancaria cb){
        
        System.out.println("Su saldo actual es: $" + cb.getSaldoActual());
    }
    
    public void datos(CuentaBancaria cb){
        
        System.out.println("Sus datos son:");
        System.out.println("DNI Nº" + cb.getDni());
        System.out.println("Cuenta Nº" + cb.getNumeroCuenta());
    }

}

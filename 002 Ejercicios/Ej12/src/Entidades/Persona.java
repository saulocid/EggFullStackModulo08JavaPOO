package Entidades;

import java.util.Calendar;

public class Persona {
    
    private String nombre;
    private Calendar nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Calendar nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Calendar getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Calendar nacimiento) {
        this.nacimiento = nacimiento;
    }
    
}

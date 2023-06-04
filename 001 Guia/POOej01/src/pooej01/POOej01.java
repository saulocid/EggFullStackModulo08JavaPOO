package pooej01;

import Entidades.Persona;
import Servicios.PersonaServicios;

public class POOej01 {

    public static void main(String[] args) {

        PersonaServicios ps = new PersonaServicios();
        
        Persona p1 = ps.crearPersona();
        ps.mostrarPersona(p1);

    }

}

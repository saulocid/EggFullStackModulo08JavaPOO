package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/* Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:

 Un constructor por defecto.

 Un constructor con todos los atributos como parámetro.

 Métodos getters y setters de cada atributo.

 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M u
O. Si no es correcto se deberá mostrar un mensaje

 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.

 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.

Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. */
public class PersonaServicio {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona per = new Persona();

        System.out.print("Ingrese el nombre: ");
        per.setNombre(leer.next());
        System.out.print("Ingrese la edad: ");
        per.setEdad(leer.nextInt());
        do {
            System.out.print("Ingrese el sexo M, F u O: ");
            per.setSexo(leer.next().charAt(0));
            if (per.getSexo() != 'M' && per.getSexo() != 'F' && per.getSexo() != 'O') {
                System.out.println("Sexo incorrecto");
            }
        } while (per.getSexo() != 'M' && per.getSexo() != 'F' && per.getSexo() != 'O');
        System.out.print("Ingrese el peso: ");
        per.setPeso(leer.nextFloat());
        System.out.print("Ingrese la altura: ");
        per.setAltura(leer.nextFloat());
        System.out.println("");

        return per;
    }

    public int calcularIMC(Persona per) {
        int valor = 0;
        int imc = (int) (per.getPeso() / (per.getAltura() * per.getAltura()));

        System.out.println("Calculando el IMC");
        if (imc < 20) {
            valor = -1;
        } else if (imc > 25) {
            valor = 1;
        }

        System.out.println("Su IMC es " + imc);

        return valor;
    }

    public void esMayorDeEdad(Persona per, int[] edad) {
        if (per.getEdad() < 18) {
            System.out.println("Eres menor de edad");
            edad[0]++;
        } else {
            System.out.println("Eres mayor de edad");
            edad[1]++;
        }
    }
    
    public void mostrarPorcentajes(int[] contEdad, int[] contImc){
        System.out.println("Porcentaje mayor de edad " + (contEdad[1] * 100 / 4) + "%");
        System.out.println("Porcentaje menor de edad " + (contEdad[0] * 100 / 4) + "%");
        System.out.println("Porcentaje debajo del peso ideal " + (contImc[0] * 100 / 4) + "%");
        System.out.println("Porcentaje PESO IDEAL " + (contImc[1] * 100 / 4) + "%");
        System.out.println("Porcentaje encima del peso ideal " + (contImc[2] * 100 / 4) + "%");
    }

}

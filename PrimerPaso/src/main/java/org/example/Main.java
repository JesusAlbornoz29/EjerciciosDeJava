package org.example;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int edad = 32 ;
        String nombre = "Jesus ";
        String apellido = "Albornoz";
        String origen = "Fray bentos, Uruguay.";
        String Objetivo = "Quiero dominar Java ";
        String suenio = "conseguir mi primer trabajo como Programador Backend Java Jr";
        String presentacion = "Hola mi nombre es " + nombre + apellido + " tengo " + edad + " anios, naci en " +
                origen + Objetivo + " y sue;o con " + suenio;

        int num1 = 15;
        int num2 = 2;
        double cociente;


        System.out.println(cociente = num1/num2); // si sumamos 2 enteros el resultado sera en entero
        System.out.println(cociente = (double)num1/num2); // podemos transformar el valor de num1 solo en el momento que se ejecuta para que pueda devolvernos un double

        System.out.println(presentacion);

        // EJERCICIO ESTRUCTURAS - EJ 1
        //
         // Definir dos numeros enteros. Asignarles un valor a cada uno.
        int numero1 = 20;
        int numero2 = 45;

        // Comprobar si un numero es divisible por el segundo
        if (numero1 % numero2 == 0){

                // e  indicar mediante un mensaje el resultado obtenido.
                System.out.println("Es divisible");
            } else {
                System.out.println("No es divisible");
            }
            // NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin decimales.


            // EJERCICIO 2
            //
             // Para representar cada una de las caracteristicas de las mascotas,
            // crea una variable y darle el valor correspondiente en el IDE.
            // No olvidar darle el tipo adecuado a lo que queremos que contenga.
            // Por cada mascota de la veterinaria que figura en la siguiente tabla,
            // vamos a tener que mostrar la informacion del animasl.
            // :a informacion va a mostrarse como el siguiente ejemplo>
            // "Manchitas tiene 2 da;os"
            // Manchitas come un kilo y medio y hace guau guau"

            String animal;
            String nombreMascota;
            int edadMascota;
            double pesoAlimento;
            String medida;
            String sonido;

            System.out.println((animal = "perro ") + (nombreMascota = "Manchitas ") + (edadMascota = 2 ) + (" Anios " ) + (pesoAlimento = 1.5) + (medida = " Kg ") + (sonido = " GuauGuau"));
            System.out.println((animal = "pez ") + (nombreMascota = "Nemo ") + (edadMascota = 1 ) + (" Anio " ) + (pesoAlimento = 140) + (medida = " gramos ") + (sonido = " GluGlu"));
            System.out.println((animal = "gato ") + (nombreMascota = "Silvestre ") + (edadMascota = 3 ) + (" Anios " ) + (pesoAlimento = 0.5) + (medida = " Kg ") + (sonido = " MiauMiau"));
            System.out.println((animal = "Tortuga ") + (nombreMascota = "Manuelita ") + (edadMascota = 12 ) + (" Anios " ) + (pesoAlimento = 300) + (medida = " gramos ") + (sonido = " Haaaaa"));
            System.out.println((animal = "Pajaro ") + (nombreMascota = "Gardel ") + (edadMascota = 1 ) + (" Anio " ) + (pesoAlimento = 350) + (medida = " gramos ") + (sonido = " Pio Pio"));

            nombre  = "jesus";
            int cantidad;
            char inicial;


            cantidad = nombre.length();
            nombre = nombre.toUpperCase();
            if (nombre.equals("JESUS"))
            {
                System.out.println("Se paso a mayuscula");
            }
            inicial = nombre.charAt(0);

            System.out.println(inicial);


            nombre = null;

            if (nombre == null) {
                System.out.println("Valor null");
            }

            Integer n1 = 5;
            Integer n2 = 10;
            int comparar;

            if (n1.equals(n2))
            {
                System.out.println("Son iguales");
            } else
            {
                comparar = n1.compareTo(n2);
                if (comparar>0)
                {
                    System.out.println(n1 + "es mayor que " +n2);
                } else {
                    System.out.println(n2 + "es mayor que " +n1);
                }
            }

            Float numero = 2.5f;
            Float numeroFloat = new Float(2.5);


            Date fecha = new Date();
        System.out.println(fecha.toString());

        // Aprendizaje: JAVA no permite hacer 2 concatenaciones dentro de una misma asignacion hay o que separarlas por ()+() o definirlas antes por que tampoco
        // deja contatenar variables que no fuerona asignadas previamente

        // --------------------------------------------------------------------------------------------------------------------------------------------------///

        // EJERCICIO STRING INTEGER
        //
        // 1- Definir dos cadenas de texto.
        //
            String cadena1 = "Tengo ganas de andar en skate";
            String cadena2 = "Quiero consolidar conocimientos en Java para ser un buen developer jr backend";
        // Comprobar si son iguales o distintas
        // e indicar mediante unmensaje.
            if (cadena1.equals(cadena2)){
                System.out.println("Son iguales");
            } else {
                System.out.println("No son iguales");
            }

            // 2 - Definir dos Integer y
            Integer p1 = 30;
            Integer p2 = 20;
            int comparacion = p1.compareTo(p2);
            // determinar cuál es mayor, cuál es menor o si son iguales. Informar el resultado obtenido.
            if (comparacion <0){
                System.out.println(p1 + " es menor que " + p2);
            } else if (comparacion ==0 ) {
                System.out.println( p1 + " es igual a " + p2);
            } else {
            System.out.println(p1 + " es mayor que "+ p2);
        }














    }
    }

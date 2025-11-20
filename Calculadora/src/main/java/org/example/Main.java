package org.example;

import java.util.Scanner;
// Instrucciones
//
//Vamos a crear nuestras primeras funciones
//creamos la clase Calculadora que por ahora solo va trabajar con nuestro tipo primitivo int
//Tenemos que crearle cuatro funciones a nuestra calculadora sumar, restar, dividir y multiplicar.

public class Main {
    public static void main(String[] args) {

        /*
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Ingrese el primer numero");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int b = scanner.nextInt();

        System.out.println("El resultado es " + calculadora.sumar(a,b));
        */

        String[] nombres = new String[5];

        nombres[0] = "Juan";
        nombres[1] = "Mario";
        nombres[2] = "Carlos";

        String[] peliculas = new String[3];

        peliculas[0] = "La era de hielo";
        peliculas[1] = "Zohan";
        peliculas[2] = "El justiciero";

        System.out.println(peliculas[0]);

        for (int i = 0; i<peliculas.length; i++){
            System.out.println(peliculas[i]);
        }
        /*acceder a un elemento por su indice*/
        System.out.println(nombres[0]);

        /*descomentar y ver que sucede accediendo a una posicion fuera de rango*/
        //System.out.println(nombres[7]);

        /*recorrer un array con un ciclo for*/
        for(int i = 0; i<nombres.length; i++)
            System.out.println(nombres[i]);

        /*recorrer un array con un ciclo while*/
        int i = 0;
        while(i < nombres.length) {
            System.out.println(nombres[i]);
            i++;
        }

        /*recorrer un array con un ciclo for each*/
        for(String nombre : nombres)
            System.out.println(nombre);


        while(i < peliculas.length){
            System.out.println(peliculas[i]);
            i++;
        }

        for (String pelicula : peliculas)
            System.out.println(pelicula);
    }
    }

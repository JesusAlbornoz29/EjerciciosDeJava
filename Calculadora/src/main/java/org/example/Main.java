package org.example;

import java.util.Scanner;
// Instrucciones
//
//Vamos a crear nuestras primeras funciones
//creamos la clase Calculadora que por ahora solo va trabajar con nuestro tipo primitivo int
//Tenemos que crearle cuatro funciones a nuestra calculadora sumar, restar, dividir y multiplicar.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.println("Ingrese el primer numero");
        int a = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        int b = scanner.nextInt();

        System.out.println("El resultado es " + calculadora.sumar(a,b));


        }
    }

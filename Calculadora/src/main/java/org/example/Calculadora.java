package org.example;

import java.util.Scanner;

public class Calculadora {
    Scanner scanner = new Scanner(System.in);

    public int sumar(int a, int b){
        return a + b;
    }


    public int restar (int a, int b){
        return a - b;
    }

    public int multiplicar (int a, int b){
        return a * b;
    }

    public double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return (double) a / b;
    }
}

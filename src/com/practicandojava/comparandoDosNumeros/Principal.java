package com.practicandojava.comparandoDosNumeros;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese un número entero: ");
        int numeroA = scanner.nextInt();
        System.out.println("Por favor ingrese otro número entero: ");
        int numeroB = scanner.nextInt();

        if (numeroA==numeroB){
            System.out.println("Los numeros ingresados son iguales");
        } else if (numeroA>numeroB) {
            System.out.println("El primer número ingresado es mayor al segundo");
        } else {
            System.out.println("El segundo número ingresado es mayor al primero");
        }

    }
}

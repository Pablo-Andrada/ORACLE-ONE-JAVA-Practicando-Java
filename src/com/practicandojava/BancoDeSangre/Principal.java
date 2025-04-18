package com.practicandojava.BancoDeSangre;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int edadMinima = 18;
        int edadMaxima = 65;

        int pesoMinimo = 50;

        System.out.println("********************************************************************************************************");
        System.out.println("BIENVENIDO AL BANCO DE SANGRE. ");
        System.out.println("Por favor ingrese la edad del donante: \n");
        int edadDonante = scanner.nextInt();
        System.out.println("Por favor ingrese el peso del donante: \n");
        double pesoDonante = scanner.nextDouble();

        if (edadDonante > edadMinima && edadDonante < edadMaxima && pesoDonante > pesoMinimo) {
            System.out.println("El donante es compatible! \n Muchas gracias por donar!!");
        } else if (edadDonante < edadMinima || edadDonante > edadMaxima) {
            System.out.println("El donante no es compatible.\n" +
                    "Motivo: Debe tener entre 18 y 65 años.");
        } else {
            System.out.println("El donante no es compatible.\n" +
                    "Motivo: El donante no alncaza el peso mínimo requerido. ");
        }

        System.out.println("********************************************************************************************************");



    }

}

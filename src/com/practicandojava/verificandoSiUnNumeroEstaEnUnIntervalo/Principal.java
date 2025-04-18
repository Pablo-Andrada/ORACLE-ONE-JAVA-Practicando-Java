package com.practicandojava.verificandoSiUnNumeroEstaEnUnIntervalo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int rangoMinimo = 1000;
        int rangoMaximo = 5000;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese el monto del prestamo a solicitar: \n");
        int montoSolicitado = scanner.nextInt();

        if (montoSolicitado >= rangoMinimo && montoSolicitado <= rangoMaximo){
            System.out.println("El monto ingresado: " + montoSolicitado + " está dentro del intervalo permitido para el préstamo. ");
        } else {
            System.out.println("El monto ingresado: " + montoSolicitado + " no está dentro del intervalo permitido para el préstamo.");
        }


    }

}

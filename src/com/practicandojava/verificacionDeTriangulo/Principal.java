package com.practicandojava.verificacionDeTriangulo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("******************************************************************************************************************");
        System.out.println("Este programa tomará el largo de 3 lados de un polígono y le dira si puede con ellos formarse un triángulo");
        System.out.println("Por favor ingrese el lado 1: \n");
        double lado1 = scanner.nextDouble();
        System.out.println("Por favor ingrese el lado 2: \n");
        double lado2 = scanner.nextDouble();
        System.out.println("Por favor ingrese el lado 3: \n");
        double lado3 = scanner.nextDouble();

        if (lado1+lado2 > lado3 ||lado1+lado3 > lado2 || lado2+lado3 > lado1){
            System.out.println("Los lados pueden formar un triángulo.");
        } else {
            System.out.println("Los lados no pueden formar un triángulo.");
        }


    }
}

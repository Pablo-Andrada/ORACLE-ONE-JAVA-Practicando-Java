package com.practicandojava.validacionDeContraseña;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int password = 123456;
        int intentos = 0;
        int intentosRestantes = (2 - intentos);

        Scanner scanner = new Scanner(System.in);

        while ( intentos < 3) {
            System.out.println("Ingrese la clave: ");
            int numero = scanner.nextInt();
            if (numero == password){
                System.out.println("La clave ingresada es correcta!");
                break;
            }else if (intentosRestantes>0){
                System.out.println("Error en la clave ingresada, por favor intente nuevamente. Recuerde que solo tiene " + (intentosRestantes) +" intentos antes de que su clave se bloquee!");
            }else {
                System.out.println("Error en la clave. Comuníquese con su administrador.");
            }
            intentos ++;
            intentosRestantes -= intentos;
        }



    }
}

package com.practicandojava.verificacionDeCodigoDeAccesoYNivelDePermiso;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int codigoDeAccesoNumerico = 2023;

        Scanner scanner = new Scanner(System.in);
        System.out.println("***************************************************************************");
        System.out.println("Ingrese el código de acceso: \n");
        int codigoDeAccesoIngresado = scanner.nextInt();

        System.out.println("Ingrese el nivel de permiso: \n");
        int nivelDePermisoIngresado = scanner.nextInt();

        if (codigoDeAccesoIngresado == codigoDeAccesoNumerico && (nivelDePermisoIngresado == 1 || nivelDePermisoIngresado == 2 || nivelDePermisoIngresado==3)){
            System.out.println("Acceso permitido. Bienvenido al Sistema!");
        } else if (codigoDeAccesoIngresado != codigoDeAccesoNumerico){
            System.out.println("El codigo de acceso ingresado es erróneo.");
        } else {
            System.out.println("El nivel de permiso ingresado es incompatible.");
        }
        System.out.println("***************************************************************************");

    }
}

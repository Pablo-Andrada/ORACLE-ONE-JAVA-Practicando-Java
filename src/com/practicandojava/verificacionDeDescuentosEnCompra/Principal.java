package com.practicandojava.verificacionDeDescuentosEnCompra;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        double montoMinimoParaDescuento = 100.00;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el monto de la compra: \n");
        double montoIngresado = scanner.nextDouble();

        if (montoIngresado>=montoMinimoParaDescuento){
            System.out.println("Descuento del 10% aplicado...");
            double montoConDescuento = montoIngresado*0.9;
            System.out.println("Nuevo valor: " + montoConDescuento);
        }else {
            System.out.println("Monto insuficiente para aplicar descuento.");
            System.out.println("Total a abonar: " + montoIngresado);
        }


    }
}

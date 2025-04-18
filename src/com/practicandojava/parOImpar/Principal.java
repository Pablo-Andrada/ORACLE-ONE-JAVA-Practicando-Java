package com.practicandojava.parOImpar;

public class Principal {
    public static void main(String[] args) {
        int numero = 3;

        if ((numero%2) == 1 ){
            System.out.println("El número " + numero + " es impar");
        } else {
            System.out.println("El número " + numero + " es par");
        }
    }
}

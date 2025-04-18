package com.practicandojava.verificacionDeDiaHabil;

import java.util.Objects;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el dia de la semana (en minúsculas): \n");
        String diaDeLaSemana = scanner.next();

        if (Objects.equals(diaDeLaSemana, "sabado") || Objects.equals(diaDeLaSemana, "domingo")){
            System.out.println(diaDeLaSemana + " no es un día hábil.");
        }else {
            System.out.println(diaDeLaSemana + " es un día hábil");
        }

    }
}

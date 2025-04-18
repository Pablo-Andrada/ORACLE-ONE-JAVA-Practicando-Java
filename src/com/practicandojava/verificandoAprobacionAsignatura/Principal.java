package com.practicandojava.verificandoAprobacionAsignatura;

public class Principal {
    public static void main(String[] args) {
        double notaPromedio = 6.9;

        if (notaPromedio >= 7.0){
            System.out.println("El estudiante obtuvo un promedio de " + notaPromedio + " y fue aprobado.");
        } else if (6.9 > notaPromedio ||notaPromedio >5.0) {
            System.out.println("El estudiante obtuvo un promedio de " + notaPromedio + " y esta en recuperación.");
        }else {
            System.out.println("El estudiante obtuvo un promedio de " + notaPromedio + " y fue reprobado.");
        }

    }
}

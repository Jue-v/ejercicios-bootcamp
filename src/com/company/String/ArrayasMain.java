package com.company.String;

import com.company.Coche;

public class ArrayasMain {

    public static void main(String[] args) {

        String nombre1 = "nombre 1";
        String nombre2 = "nombre 2";
        String nombre3 = "nombre 3";

        //Vacíos los arrays
        String[] nombres = new String[3];
        String[] nombres2 = new String[]{nombre1, nombre2,nombre3};
        int[] numeros = new int[5];
        Coche[] coches = new Coche[2];

        System.out.println(nombres2);

        //Llenado de los arrays
        nombres[0] = nombre1;
        nombres[1] = nombre2;
        nombres[2] = nombre3;

        for(int i = 0; i < nombres.length;i++){
            System.out.println(nombres[i]);
        }
    }
}

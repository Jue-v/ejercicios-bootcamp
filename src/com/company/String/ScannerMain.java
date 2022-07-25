package com.company.String;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        //system out= es lo que sale
        //system in = es lo que voy a leer
        //Creamos un objeto scanner con una clase Scanner que me permite codificar los datos que lee
        Scanner scanner = new Scanner(System.in );
        System.out.println("Introduce un nombre");
        //para poder extraerlos y usarlos
        String nombre = scanner.nextLine();
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El numero es: " + numero);

    }
}

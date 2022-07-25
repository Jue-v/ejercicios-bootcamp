package com.company.String;

import java.util.Locale;

public class StringMain {

    public static void main(String[] args) {
        //La clase String
        /*
        Métodos de los Strings
        length()
        startsWith("")
        endsWith("")
        indexOf("")
        subString(1,5)
        trim()
        equals()
        compareTo
         */

        // "String" y 'Char'
        String mensaje = "   Hola mundo   ";
        System.out.println(mensaje.length());
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim());
        mensajeMAY= mensajeMAY.trim();
        String otro = "HOLA MUNDO";

        //Para saber si un String es igual a otro
        if(mensajeMAY.equalsIgnoreCase(otro)){
            System.out.println("Verdadero!!!");
        }

    }
}

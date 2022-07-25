package com.company.String;


import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {
        //Para crear una lista, se le dice que tipo de dato se va a usar
        List<String> nombres = new ArrayList<>();
        //Para agregar datos
        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        //Para iterar los datos de la lista.,
        // Foreach - LLeva el tipo de dato, el nombre que se le va a dar, : y la lista
        for(String nombre : nombres){
            System.out.println(nombre);
        }

        //Trabajar objetos de las clases
        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("honda civic"));
        coches.add(new Coche("alfa romeo"));
        coches.add(new Coche("ford mondeo"));

        System.out.println(coches);

    }


}

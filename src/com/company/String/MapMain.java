package com.company.String;

import java.util.HashMap;
import java.util.Map;

public class MapMain {


    public static void main(String[] args) {

        //Son estructuras que trabajan claves, valores
        Map<String, String> personas = new HashMap<>();
        //put para claves
        personas.put("123456H", "Nombre Apellido1");
        personas.put("123456L", "Nombre Apellido2");
        personas.put("123456P", "Nombre Apellido3");

        System.out.println(personas);
        //Imprimir las claves
        for(String key : personas.keySet()){
            System.out.println(key);
        }
        //Imprimir los valores
        for(String value  : personas.values()){
            System.out.println(value );
        }
        //Sacar un par de clave valor, Iterar el mapa de fora mas idonea
        for(Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}

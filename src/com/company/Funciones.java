package com.company;

public class Funciones {

    public static void main(String[] args) {

        //holaMundo();
        //holaMundo();
        holaMundo("Leah");
        holaMundo(4);

        //String hola = devolverHola();
        //System.out.println(hola);


    }

    private static String  devolverHola() {
        return "Hola XD";
    }

    private static void holaMundo(String name) {
        System.out.println("Hola " + name);
    }

    private static void holaMundo(Integer number) {
        System.out.println("El numero es: " + number);
    }

    public static void holaMundo() {

        System.out.println("Hola mundo");
        System.out.println("Hola pets");

    }

    private static int sum(int num1, int num2){
        return num1 + num2;
    }

    // sobrecargar una funcion
    // Es llamarla varias veces con diferentes prametros sin que se presenteb errorres
    // mientras los parametros sen diferentesS

}

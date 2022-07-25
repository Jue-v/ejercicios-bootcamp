package com.company;

public class Whileloop {

    public static void main(String[] args) {

        //boolean check = true;

        int count = 0;
        while (count < 10) {

            //Cuando hay un continue es mejor iniciar el contador al principio para romper la condicion
            count ++;

            if (count == 6) {
                break; //romple el flujo de ejecucion
                //continue;//Salta el valor 6 y continua la iteración
            }
            System.out.println("Hola mundo "+ count);

        }
        System.out.println("fin");
    }
}

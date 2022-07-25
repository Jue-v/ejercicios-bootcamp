package com.company.String;

public class TryCatchMain {

    public static void main(String[] args) {
        //Encontrar los fallos y capturarlos Trycatch para que el programa continue

        try {                               // Encierra la instruccion que da problema
            int result = 5 / 0;
        }catch (ArithmeticException e) {    //Lo que queremos que haga
            e.printStackTrace();            //Método de impresion de trycatch que muestra el error
        }finally{                           //Se agrega esta seccion para cerrar recursos, correciones etc
            System.out.println("Cierre de recursos");
        }


        System.out.println("fin ");

    }
    //throw y trows son mecanismos para excepciones. Se propagan las excepciones para que
    //lo lea el método general y por ende lo lean los métodos que lo van a usar,
    //con trycath se capturan y con throw se


}

package com.company.String;

import java.util.Scanner;

public class ThrowMain {

    public static void main(String[] args) {
        //Para lanzar excepciones siempre hy que capturarlas
        try{
            leerNombres();
        }catch(NameFormatException e ){
            e.printStackTrace();
        }
    }

    //Método que lee nombres de consola y verifica que tengan longitud igual o mayor a 8

    //Cuando se lanza una exception debemos declarar en el metodo que se va a lanzar la exception throws
    private static void leerNombres() throws NameFormatException {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un nombre ");
        while(teclado.hasNext()){
            System.out.println("Introduce un nombre ");
            String nombre = teclado.nextLine();
            if(nombre.length() < 8){
                teclado.close();
                //con el new se crea un objeto y con el throw se lanza
                throw new NameFormatException("El nombre debe contener minimo 8 caracteres");
            }
        }
        teclado.close();
    }

}

package com.company;

public class PolimorfismoMain {

    public static void main(String[] args) {

        //Creacion de objetos apartir de clases
        Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();

        //Polimorfismo hace que se creen los objetos desde la clase principal
        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        //instanceof comprueba que ese objeto sea de esa clase o subclase
        if (coche4 instanceof Coche){
            System.out.println("Coche");
        }

        if (coche4 instanceof CocheElectrico){
            System.out.println("Coche Electrico");
        }
        if (coche4 instanceof CocheHibrido){
            System.out.println("Coche Hibrido");
        }

    }
}

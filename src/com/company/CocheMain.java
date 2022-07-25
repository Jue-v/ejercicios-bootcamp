package com.company;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romeo";
        Coche cocheObj = new Coche(); // Se busca la clase y el new busca el constructor en esa clase

        Coche cocheObj2 = new Coche("rojo","honda", "civic", 1430.45, 5.4 );

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Honda";
        cocheElectrico.motorElectrico = "civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul","alfa","romeo",1500d, 4.99,"TXZ");
        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);


    }
}

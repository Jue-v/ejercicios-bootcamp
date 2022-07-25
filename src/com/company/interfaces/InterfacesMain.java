package com.company.interfaces;

import com.company.Coche;

public class InterfacesMain {
    //LO que hace el main es utilizar el codigo de la interfaz

    public static void main(String[] args) {

        /*
        //Polimorfismos sobre interfaces
        CocheService service1 = new CocheServiceSportImpl();
        CocheService service2 = new CocheServiceClassicImpl();

        Coche coche1 = service2.crearCocheDemo();
        Coche coche2 = service1.crearCocheDemo();
        */

        //o
        CocheService service = new CocheServiceSportImpl();
        Coche coche = service.crearCocheDemo();

    }
}

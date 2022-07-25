package com.company.interfaces;

import com.company.Coche;
import com.company.CocheElectrico;
import com.company.interfaces.CocheService;

//Se implementa desde la interfaz, estas clases estan obligadas a darle cuerpo a esos metodos de la interfaz
    public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
    System.out.println("Destruir coche clasico");
    }
}

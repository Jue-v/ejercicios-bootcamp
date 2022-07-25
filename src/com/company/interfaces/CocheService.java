package com.company.interfaces;

import com.company.Coche;

public interface CocheService {

    //Los métodos llevan (), solo se nombran, no llevan cuerpo. La interface solo declara metodos
    //que las clases deben implementar

    public Coche crearCocheDemo();
    public void destruirCoche(Coche coche);
}

package com.personagens;

import java.awt.*;
import java.util.Random;

public class CoordenadaFactory {
    private static CoordenadaFactory instancia = null;

    private CoordenadaFactory() {
    }

    public static synchronized CoordenadaFactory getInstancia() {
        if (instancia == null) {
            instancia = new CoordenadaFactory();
        }
        return instancia;
    }
    public static Point geraCoordenadaAleatoria() {
        return new Point(new Random().nextInt(0,100), new Random().nextInt(0,100));
    }
}

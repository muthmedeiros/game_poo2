package com.pulo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PuloFactory {
    private static PuloFactory instancia = null;

    private PuloFactory() {
    }

    public static synchronized PuloFactory getInstancia() {
        if (instancia == null) {
            instancia = new PuloFactory();
        }
        return instancia;
    }

    public static Pulo geraPuloAleatorio() {
        List<Pulo> pulos = Arrays.asList(new PuloBaixo(), new PuloMedio(), new PuloAlto());
        int index = new Random().nextInt(pulos.toArray().length);

        return pulos.get(index);
    }
}

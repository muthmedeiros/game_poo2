package com.estado;



import com.ataque.Forte;
import com.ataque.Fraco;
import com.personagens.Pessoa;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EstadoFactory {
    private static EstadoFactory instancia = null;

    private EstadoFactory() {
    }

    public static synchronized EstadoFactory getInstancia() {
        if (instancia == null) {
            instancia = new EstadoFactory();
        }
        return instancia;
    }

    public static Estado geraEstado(Pessoa pessoa) {
        List<Estado> ataques = Arrays.asList(new Fraco(pessoa), new Normal(pessoa), new Forte(pessoa));
        int index = new Random().nextInt(ataques.toArray().length);

        return ataques.get(index);
    }
}

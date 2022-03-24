package com.personagens;

import com.armas.Espada;
import com.defesa.Escudo;

public class Espadachim extends Personagem {
    public Espadachim(String nome) {
        super(nome);
        this.setArma(new Espada());
        this.setDefesa(new Escudo());
    }
}

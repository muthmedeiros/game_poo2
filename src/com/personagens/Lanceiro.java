package com.personagens;

import com.armas.Lanca;
import com.defesa.Armadura;

public class Lanceiro extends Personagem {
    public Lanceiro(String nome) {
        super(nome);
        this.setArma(new Lanca());
        this.setDefesa(new Armadura());
    }
}

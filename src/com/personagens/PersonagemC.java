package com.personagens;

import com.ataque.AtaqueForte;
import com.corrida.CorridaRapida;
import com.pulo.PuloBaixo;

public class PersonagemC extends Personagem{
    public PersonagemC(String nome) {
        super(nome);
        setPulo( new PuloBaixo());
        setAtaque( new AtaqueForte());
        setCorrida(new CorridaRapida());
    }
}


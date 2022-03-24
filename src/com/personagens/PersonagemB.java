package com.personagens;

import com.ataque.AtaqueMedio;
import com.corrida.CorridaRapida;
import com.pulo.PuloAlto;

public class PersonagemB extends Personagem {
    public PersonagemB(String nome) {
        super(nome);
        setPulo(new PuloAlto());
        setCorrida(new CorridaRapida());
        setAtaque( new AtaqueMedio());
    }
}

package com.personagens;


import com.ataque.AtaqueForte;
import com.corrida.CorridaMedia;
import com.pulo.PuloMedio;

public class PersonagemA extends Personagem {
    public PersonagemA(String nome) {
        super(nome);
        setPulo( new PuloMedio());
        setCorrida(new CorridaMedia());
        setAtaque( new AtaqueForte());
    }
}

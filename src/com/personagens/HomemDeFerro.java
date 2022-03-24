package com.personagens;

import com.armas.RaioLaser;
import com.defesa.ArmaduraEspecial;

public class HomemDeFerro extends Personagem {
    public HomemDeFerro(String nome) {
        super(nome);
        this.setArma(new RaioLaser());
        this.setDefesa(new ArmaduraEspecial());
    }
}

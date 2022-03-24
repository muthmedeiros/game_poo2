package com.estado;

import com.ataque.Ataque;
import com.ataque.AtaqueDecorador;

public class MeiaVida extends AtaqueDecorador {
    public MeiaVida(Ataque ataqueDecorado) {
        super(ataqueDecorado);
    }

    @Override
    public int atacar() {
        return this.getAtaqueDecorado().getDanoAtaque() + 50;
    }
}

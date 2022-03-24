package com.ataque;

import com.corrida.CorridaRapida;
import com.estado.Estado;
import com.estado.Morto;
import com.estado.Normal;
import com.personagens.Pessoa;
import com.pulo.PuloAlto;

public class Forte extends Estado {
    public Forte(Pessoa pessoa) {
        super(pessoa);
        this.getPessoa().setAtaque(new AtaqueForte());
        this.getPessoa().setCorrida(new CorridaRapida());
        this.getPessoa().setPulo(new PuloAlto());
    }

    @Override
    protected void verificarAlteracaoEstado() {
        if (this.getPessoa().getVida() <= this.getNormal() && this.getPessoa().getVida() >= this.getPerigo()) {
            this.getPessoa().setEstado(new Normal(this.getPessoa()));
        } else if (this.getPessoa().getVida() < this.getPerigo() && this.getPessoa().getVida() > this.getMorte()) {
            this.getPessoa().setEstado(new Fraco(this.getPessoa()));
        } else if (this.getPessoa().getVida() <= this.getMorte()) {
            this.getPessoa().setEstado(new Morto(this.getPessoa()));
        }
    }
}

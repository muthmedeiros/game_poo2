package com.estado;

import com.personagens.Pessoa;

public class Morto extends Estado {
    public Morto(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    protected void verificarAlteracaoEstado() {
    }
}

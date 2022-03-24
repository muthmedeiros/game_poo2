package com.personagens;
import com.personagens.CoordenadaFactory;

import com.estado.EstadoFactory;

import java.awt.*;

public class Inimigo extends Pessoa implements Observer {
    public Inimigo(String nome) {
        super(nome, 100);
        setEstado(EstadoFactory.geraEstado(this));
    }

    @Override
    public void atualizaCoord(Personagem personagem) {
        final Point coordenadasDoPersonagem = personagem.getCoordenadas();
        int novoX = coordenadasDoPersonagem.x;
        int novoY = coordenadasDoPersonagem.y;

        if (VerificacaoCoordenadas.podeAtacar(coordenadasDoPersonagem, this.getCoordenadas())) {
            ataca(personagem);
        } else {
            if (coordenadasDoPersonagem.x > this.getCoordenadas().x) {
                novoX = this.getCoordenadas().x + 1;
            } else if (coordenadasDoPersonagem.x < this.getCoordenadas().x) {
                novoX = this.getCoordenadas().x - 1;
            }
            if (coordenadasDoPersonagem.y > this.getCoordenadas().y) {
                novoY = this.getCoordenadas().y + 1;
            } else if (coordenadasDoPersonagem.y < this.getCoordenadas().y) {
                novoY = this.getCoordenadas().y - 1;
            }

            this.setCoordenadas(new Point(novoX, novoY));
        }
    }

    @Override
    public void ataca(Personagem personagem) {
        personagem.recebeAtaque(this.getAtaque());
    }
}

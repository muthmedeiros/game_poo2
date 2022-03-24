package com.personagens;

import com.armas.Arma;
import com.armas.Kamehameha;
import com.defesa.EscudoHextec;

public class Android extends Personagem {
    public Android(String nome) {
        super(nome);
        this.setArma(new Kamehameha());
        this.setDefesa(new EscudoHextec());
    }

    public static class ArcoFlecha extends Arma {
        public ArcoFlecha() {
            System.out.println("Armas.Arma: Arco e Flecha.");
        }
    }
}

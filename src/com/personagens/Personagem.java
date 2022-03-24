package com.personagens;

import com.armas.Arma;
import com.ataque.AcertoFatal;
import com.ataque.AtaqueDobro;
import com.ataque.Forte;
import com.defesa.Defesa;
import com.estado.MeiaVida;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Personagem extends Pessoa implements Subject {
    private Arma arma;
    private Defesa defesa;
    private final ArrayList<Observer> observadores = new ArrayList<>();

    public Personagem(String nome) {
        super(nome, 100);
        this.setEstado(new Forte(this));
    }

    public void acoes(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP -> this.movimentar(new Point(0, -1));
            case KeyEvent.VK_DOWN -> this.movimentar(new Point(0, 1));
            case KeyEvent.VK_LEFT -> this.movimentar(new Point(-1, 0));
            case KeyEvent.VK_RIGHT -> this.movimentar(new Point(1, 0));
            case KeyEvent.VK_SPACE -> this.atacar();
            // Alteração de decoração do ataque em tempo de execução
            case KeyEvent.VK_F1 -> this.setAtaque(new AcertoFatal(this.getAtaque()));
            case KeyEvent.VK_F2 -> this.setAtaque(new AtaqueDobro(this.getAtaque()));
            case KeyEvent.VK_F3 -> this.setAtaque(new MeiaVida(this.getAtaque()));
            default -> throw new IllegalStateException("Unexpected value: " + keyCode);
        }

        notificarObservadores();
    }

    public void atacar() {
        for (Observer observador : observadores) {
            Inimigo inimigo = (Inimigo) observador;
            if (VerificacaoCoordenadas.podeAtacar(this.getCoordenadas(), inimigo.getCoordenadas())) {
                inimigo.recebeAtaque(getAtaque());
            }
        }
    }

    public void recebeVida(int vida) {
        if (this.getVida() > 0) {
            if (this.getVida() + vida <= 100) {
                this.setVida(this.getVida() + vida);
            }
            this.getEstado().ganhaVida(vida);
        }
    }

    @Override
    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Object observador : observadores) {
            Inimigo inimigo = (Inimigo) observador;
            if (inimigo.getVida() <= 0) {
                removerObservador(inimigo);
                break;
            }
            inimigo.atualizaCoord(this);
        }
    }

    public ArrayList<Observer> getObservadores() {
        return this.observadores;
    }

    public Defesa getDefesa() {
        return defesa;
    }

    public void setDefesa(Defesa defesa) {
        this.defesa = defesa;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
}

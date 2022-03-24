import com.personagens.Inimigo;
import com.personagens.Personagem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class GamePanel extends JPanel {

    private Personagem personagem;
    private ArrayList<Inimigo> inimigos;

    public GamePanel(Personagem personagem, ArrayList<Inimigo> inimigos) {
        setPersonagem(personagem);
        setInimigos(inimigos);
        setBackground(Color.BLACK);
        setBounds(5, 5, 110, 110);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(personagem.getCoordenadas().x, personagem.getCoordenadas().y, 10, 10);

        for (Inimigo inimigo : inimigos) {
            if (inimigo.getVida() <= 0) {
                g.setColor(Color.black);
            } else {
                g.setColor(Color.red);
            }
            g.drawRect(inimigo.getCoordenadas().x, inimigo.getCoordenadas().y, 10, 10);
        }
    }

    public void keyPressed(KeyEvent e) {
        personagem.acoes(e);
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public void setInimigos(ArrayList<Inimigo> inimigos) {
        this.inimigos = inimigos;
    }
}
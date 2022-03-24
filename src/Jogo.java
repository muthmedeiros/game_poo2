import com.personagens.Inimigo;
import com.personagens.Personagem;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Jogo {
    public abstract Personagem geraPersonagem(String nome, int tipoDoPersonagem);

    public void jogar(String nomeDoPersonagem, int tipoDoPersonagem) {
        Personagem personagem = geraPersonagem(nomeDoPersonagem, tipoDoPersonagem);
        Inimigo inimigo1 = new Inimigo("Personagens.Inimigo 1");
        Inimigo inimigo2 = new Inimigo("Personagens.Inimigo 2");
        Inimigo inimigo3 = new Inimigo("Personagens.Inimigo 3");

        personagem.adicionarObservador(inimigo1);
        personagem.adicionarObservador(inimigo2);
        personagem.adicionarObservador(inimigo3);

        ArrayList<Inimigo> inimigos = new ArrayList<>(Arrays.asList(inimigo1, inimigo2, inimigo3));

        GameFrame frame = new GameFrame(personagem, inimigos);
    }
}

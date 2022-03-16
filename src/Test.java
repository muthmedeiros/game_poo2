import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Personagem personagem = new Personagem("Jogador");
        Inimigo inimigo1 = new Inimigo("Inimigo 1");
        Inimigo inimigo2 = new Inimigo("Inimigo 2");
        Inimigo inimigo3 = new Inimigo("Inimigo 3");

        personagem.adicionarObservador(inimigo1);
        personagem.adicionarObservador(inimigo2);
        personagem.adicionarObservador(inimigo3);

        ArrayList<Inimigo> inimigos = new ArrayList<>(Arrays.asList(inimigo1, inimigo2, inimigo3));

        GameFrame frame = new GameFrame(personagem, inimigos);
    }
}

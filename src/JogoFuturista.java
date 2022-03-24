import com.personagens.Android;
import com.personagens.HomemDeFerro;
import com.personagens.Personagem;
import com.personagens.Robo;

public class JogoFuturista extends Jogo {
    private static JogoFuturista instancia = null;

    private JogoFuturista() {
        System.out.println("Personagens disponíveis:\n1 - Robô\n2 - Personagens.Android\n3 - Homem de Ferro");
    }

    public static synchronized JogoFuturista getInstancia() {
        if (instancia == null) {
            instancia = new JogoFuturista();
        }
        return instancia;
    }

    @Override
    public Personagem geraPersonagem(String nome, int tipoDoPersonagem) {
        Personagem personagem = null;

        if (tipoDoPersonagem == 1) {
            personagem = new Robo(nome);
        } else if (tipoDoPersonagem == 2) {
            personagem = new Android(nome);
        } else if (tipoDoPersonagem == 3) {
            personagem = new HomemDeFerro(nome);
        } else {
            personagem = new Robo(nome);
        }

        return personagem;
    }
}

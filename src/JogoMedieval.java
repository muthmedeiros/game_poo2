import com.personagens.Arqueiro;
import com.personagens.Espadachim;
import com.personagens.Lanceiro;
import com.personagens.Personagem;

public class JogoMedieval extends Jogo {
    private static JogoMedieval instancia = null;

    private JogoMedieval() {
        System.out.println("Personagens disponíveis:\n1 - Personagens.Arqueiro\n2 - Personagens.Lanceiro\n3 - Personagens.Espadachim");
    }

    public static synchronized JogoMedieval getInstancia() {
        if (instancia == null) {
            instancia = new JogoMedieval();
        }
        return instancia;
    }

    @Override
    public Personagem geraPersonagem(String nome, int tipoDoPersonagem) {
        Personagem personagem = null;

        if (tipoDoPersonagem == 1) {
            personagem = new Arqueiro(nome);
        } else if (tipoDoPersonagem == 2) {
            personagem = new Lanceiro(nome);
        } else if (tipoDoPersonagem == 3) {
            personagem = new Espadachim(nome);
        } else {
            personagem = new Arqueiro(nome);
        }

        return personagem;
    }
}

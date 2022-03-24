import com.ataque.AcertoFatal;
import com.ataque.AtaqueDobro;
import com.estado.MeiaVida;
import com.personagens.Personagem;
import com.personagens.PersonagemA;
import com.personagens.PersonagemB;
import com.personagens.PersonagemC;

public class JogoSimples extends Jogo {
    private static JogoSimples instancia = null;

    private JogoSimples() {
    }

    public static synchronized JogoSimples getInstancia() {
        if (instancia == null) {
            instancia = new JogoSimples();
        }
        return instancia;
    }

    @Override
    public Personagem geraPersonagem(String nome, int tipoDoPersonagem) {
        Personagem personagem = null;
        double random = Math.random();

        if (random <= 0.2) {
            personagem = new PersonagemA(nome);
            personagem.setAtaque(new AtaqueDobro(personagem.getAtaque()));
        } else if (random <= 0.4) {
            personagem = new PersonagemB(nome);
            personagem.setAtaque(new AcertoFatal(personagem.getAtaque()));
        } else if (random <= 0.6) {
            personagem = new PersonagemC(nome);
            personagem.setAtaque(new AtaqueDobro(personagem.getAtaque()));
        } else if (random <= 0.8) {
            personagem = new PersonagemA(nome);
            personagem.setAtaque(new MeiaVida(personagem.getAtaque()));
        } else {
            personagem = new PersonagemB(nome);
            personagem.setAtaque(new MeiaVida(personagem.getAtaque()));
        }

        return personagem;
    }
}

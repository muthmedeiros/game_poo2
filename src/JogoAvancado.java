public class JogoAvancado extends Jogo {
    private static JogoAvancado instancia = null;

    private JogoAvancado() {
    }

    public static synchronized JogoAvancado getInstancia() {
        if (instancia == null) {
            instancia = new JogoAvancado();
        }
        return instancia;
    }

    @Override
    public Personagem geraPersonagem(String nome, int tipoDoPersonagem) {
        Personagem personagem = new Personagem(nome);
        double random = Math.random();
        Ataque ataqueAleatorio = AtaqueFactory.geraAtaqueAleatorio();

        if (random <= 0.2) {
            personagem.setAtaque(new MeiaVida(new AtaqueForte()));
            personagem.setPulo(new PuloAlto());
            personagem.setCorrida(new CorridaRapida());
        } else if (random <= 0.4) {
            personagem.setAtaque(new AtaqueDobro(ataqueAleatorio));
            personagem.setPulo(new PuloMedio());
            personagem.setCorrida(new CorridaMedia());
        } else if (random <= 0.6) {
            personagem.setAtaque(new AcertoFatal(new AtaqueForte()));
            personagem.setPulo(new PuloBaixo());
            personagem.setCorrida(new CorridaLenta());
        } else if (random <= 0.8) {
            personagem.setAtaque(new AtaqueDobro(new AtaqueForte()));
            personagem.setPulo(new PuloMedio());
            personagem.setCorrida(new CorridaLenta());
        } else {
            personagem.setAtaque(ataqueAleatorio);
            personagem.setPulo(PuloFactory.geraPuloAleatorio());
            personagem.setCorrida(CorridaFactory.geraCorridaAleatoria());
        }

        return personagem;
    }
}

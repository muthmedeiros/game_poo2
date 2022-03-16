public class PersonagemSimplesFactory extends Jogo {
    @Override
    public Personagem geraPersonagem(String nome) {
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

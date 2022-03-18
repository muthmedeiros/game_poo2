public class Espadachim extends Personagem {
    public Espadachim(String nome) {
        super(nome);
        this.setArma(new Espada());
        this.setDefesa(new Escudo());
    }
}

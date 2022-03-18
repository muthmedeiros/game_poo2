public class Lanceiro extends Personagem {
    public Lanceiro(String nome) {
        super(nome);
        this.setArma(new Lanca());
        this.setDefesa(new Armadura());
    }
}

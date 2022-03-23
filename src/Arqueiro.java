public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome);
        this.setArma(new Android.ArcoFlecha());
        this.setDefesa(new Capacete());
    }
}

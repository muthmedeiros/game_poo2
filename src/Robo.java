public class Robo extends Personagem {
    public Robo(String nome) {
        super(nome);
        this.setArma(new RaioParalisante());
        this.setDefesa(new CampoMagnetico());
    }
}

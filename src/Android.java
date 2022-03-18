public class Android extends Personagem {
    public Android(String nome) {
        super(nome);
        this.setArma(new Kamehameha());
        this.setDefesa(new EscudoHextec());
    }
}

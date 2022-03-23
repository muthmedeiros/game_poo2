public class Android extends Personagem {
    public Android(String nome) {
        super(nome);
        this.setArma(new Kamehameha());
        this.setDefesa(new EscudoHextec());
    }

    public static class ArcoFlecha extends Arma {
        public ArcoFlecha() {
            System.out.println("Arma: Arco e Flecha.");
        }
    }
}

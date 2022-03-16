public class AcertoFatal extends AtaqueDecorador {
    public AcertoFatal(Ataque ataqueDecorado) {
        super(ataqueDecorado);
    }

    @Override
    public int atacar() {
        return this.getAtaqueDecorado().getDanoAtaque() + 100;
    }
}

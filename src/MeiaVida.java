public class MeiaVida extends AtaqueDecorador {
    public MeiaVida(Ataque ataqueDecorado) {
        super(ataqueDecorado);
    }

    @Override
    public int atacar() {
        return this.getAtaqueDecorado().getDanoAtaque() + 50;
    }
}

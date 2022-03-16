public class AtaqueDobro extends AtaqueDecorador {
    public AtaqueDobro(Ataque ataqueDecorado) {
        super(ataqueDecorado);
    }

    @Override
    public int atacar() {
        return this.getAtaqueDecorado().getDanoAtaque() * 2;
    }
}

public abstract class AtaqueDecorador extends Ataque {
    private final Ataque ataqueDecorado;

    public AtaqueDecorador(Ataque ataqueDecorado) {
        this.ataqueDecorado = ataqueDecorado;
    }

    public Ataque getAtaqueDecorado() {
        return ataqueDecorado;
    }
}

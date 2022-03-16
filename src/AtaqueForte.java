public class AtaqueForte extends Ataque {
    public AtaqueForte() {
        setDanoAtaque(30);
    }

    @Override
    public int atacar() {
        this.setDanoAtaque(AtaqueCritico.critico(this.getDanoAtaque()));

        return this.getDanoAtaque();
    }
}

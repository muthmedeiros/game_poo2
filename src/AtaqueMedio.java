public class AtaqueMedio extends Ataque {
    public AtaqueMedio() {
        setDanoAtaque(15);
    }

    @Override
    public int atacar() {
        this.setDanoAtaque(AtaqueCritico.critico(this.getDanoAtaque()));

        return this.getDanoAtaque();
    }
}

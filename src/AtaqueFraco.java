public class AtaqueFraco extends Ataque {
    public AtaqueFraco() {
        setDanoAtaque(5);
    }

    @Override
    public int atacar() {
        this.setDanoAtaque(AtaqueCritico.critico(this.getDanoAtaque()));

        return this.getDanoAtaque();
    }
}

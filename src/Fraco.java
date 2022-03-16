public class Fraco extends Estado {
    public Fraco(Pessoa pessoa) {
        super(pessoa);
        this.getPessoa().setAtaque(new AtaqueFraco());
        this.getPessoa().setCorrida(new CorridaLenta());
        this.getPessoa().setPulo(new PuloBaixo());
    }

    @Override
    protected void verificarAlteracaoEstado() {
        if (this.getPessoa().getVida() >= this.getForte()) {
            this.getPessoa().setEstado(new Forte(this.getPessoa()));
        } else if (this.getPessoa().getVida() <= this.getNormal() && this.getPessoa().getVida() >= this.getPerigo()) {
            this.getPessoa().setEstado(new Normal(this.getPessoa()));
        } else if (this.getPessoa().getVida() <= this.getMorte()) {
            this.getPessoa().setEstado(new Morto(this.getPessoa()));
        }
    }
}

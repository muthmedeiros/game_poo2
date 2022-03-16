public class Normal extends Estado {
    public Normal(Pessoa pessoa) {
        super(pessoa);
        this.getPessoa().setAtaque(new AtaqueMedio());
        this.getPessoa().setCorrida(new CorridaMedia());
        this.getPessoa().setPulo(new PuloMedio());
    }

    @Override
    protected void verificarAlteracaoEstado() {
        if (this.getPessoa().getVida() >= this.getForte()) {
            this.getPessoa().setEstado(new Forte(this.getPessoa()));
        } else if (this.getPessoa().getVida() < this.getPerigo() && this.getPessoa().getVida() > this.getMorte()) {
            this.getPessoa().setEstado(new Fraco(this.getPessoa()));
        } else if (this.getPessoa().getVida() <= this.getMorte()) {
            this.getPessoa().setEstado(new Morto(this.getPessoa()));
        }
    }
}

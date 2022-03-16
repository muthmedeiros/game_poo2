public abstract class Estado {
    private final int morte;
    private final int perigo;
    private final int normal;
    private final int forte;
    private Pessoa pessoa;

    public Estado(Pessoa pessoa) {
        setPessoa(pessoa);
        this.morte = 0;
        this.perigo = 30;
        this.normal = 70;
        this.forte = 100;
    }

    public void perdeVida(int vida) {
        this.pessoa.setVida(this.pessoa.getVida() - vida);

        this.verificarAlteracaoEstado();
    }

    public void ganhaVida(int vida) {
        this.pessoa.setVida(Math.min(this.pessoa.getVida() + vida, 100));

        this.verificarAlteracaoEstado();
    }

    protected abstract void verificarAlteracaoEstado();

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getMorte() {
        return morte;
    }

    public double getPerigo() {
        return perigo;
    }

    public double getNormal() {
        return normal;
    }

    public double getForte() {
        return forte;
    }
}

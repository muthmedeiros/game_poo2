public abstract class Ataque {
    private Ataque sucessor;
    private int danoAtaque;

    public abstract int atacar();

    public Ataque getSucessor() {
        return sucessor;
    }

    public void setSucessor(Ataque sucessor) {
        this.sucessor = sucessor;
    }

    public int getDanoAtaque() {
        return danoAtaque;
    }

    public void setDanoAtaque(int danoAtaque) {
        this.danoAtaque = danoAtaque;
    }
}

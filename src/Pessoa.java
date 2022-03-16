import java.awt.*;

public abstract class Pessoa {
    private String nome;
    private int vida;
    private Point coordenadas;
    private Ataque ataque;
    private Corrida corrida;
    private Pulo pulo;
    private Estado estado;

    public Pessoa(String nome, int vida) {
        setNome(nome);
        setVida(vida);
        setCoordenadas(CoordenadaFactory.geraCoordenadaAleatoria());
    }

    public void movimentar(Point movimento) {
        int novoX = this.getCoordenadas().x;
        int novoY = this.getCoordenadas().y;

        if (novoX + movimento.x > 0 && novoX + movimento.x < 100)
            novoX = this.getCoordenadas().x + movimento.x;
        if (novoY + movimento.y > 0 && novoY + movimento.y < 100)
            novoY = this.getCoordenadas().y + movimento.y;

        final Point novoPonto = new Point(novoX, novoY);

        this.setCoordenadas(novoPonto);
    }

    public void recebeAtaque(Ataque ataque) {
        final int vida = ataque.atacar();

        estado.perdeVida(vida);
    }

    public void correr() {
        getCorrida().correr();
    }

    public void pular() {
        getPulo().pular();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Point getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Point coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Ataque getAtaque() {
        return ataque;
    }

    public void setAtaque(Ataque ataque) {
        this.ataque = ataque;
    }

    public Corrida getCorrida() {
        return corrida;
    }

    public void setCorrida(Corrida corrida) {
        this.corrida = corrida;
    }

    public Pulo getPulo() {
        return pulo;
    }

    public void setPulo(Pulo pulo) {
        this.pulo = pulo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}

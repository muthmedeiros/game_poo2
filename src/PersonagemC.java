public class PersonagemC extends Personagem{
    public PersonagemC(String nome) {
        super(nome);
        setPulo( new PuloBaixo());
        setAtaque( new AtaqueForte());
        setCorrida(new CorridaRapida());
    }
}


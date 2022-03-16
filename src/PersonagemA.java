public class PersonagemA extends Personagem {
    public PersonagemA(String nome) {
        super(nome);
        setPulo( new PuloMedio());
        setCorrida(new CorridaMedia());
        setAtaque( new AtaqueForte());
    }
}

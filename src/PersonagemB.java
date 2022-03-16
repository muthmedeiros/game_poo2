public class PersonagemB extends Personagem {
    public PersonagemB(String nome) {
        super(nome);
        setPulo(new PuloAlto());
        setCorrida(new CorridaRapida());
        setAtaque( new AtaqueMedio());
    }
}

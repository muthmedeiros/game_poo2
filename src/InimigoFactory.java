public class InimigoFactory {
    private static InimigoFactory instancia = null;

    private InimigoFactory() {
    }

    public static synchronized InimigoFactory getInstancia() {
        if (instancia == null) {
            instancia = new InimigoFactory();
        }
        return instancia;
    }

    public static Inimigo geraInimigo(String nome) {
        return new Inimigo(nome);
    }
}

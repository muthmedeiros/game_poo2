import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CorridaFactory {
    private static CorridaFactory instancia = null;

    private CorridaFactory() {
    }

    public static synchronized CorridaFactory getInstancia() {
        if (instancia == null) {
            instancia = new CorridaFactory();
        }
        return instancia;
    }

    public static Corrida geraCorridaAleatoria() {
        List<Corrida> corridas = Arrays.asList(new CorridaLenta(), new CorridaMedia(), new CorridaRapida());
        int index = new Random().nextInt(corridas.toArray().length);

        return corridas.get(index);
    }
}

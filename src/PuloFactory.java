import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PuloFactory {
    public static Pulo geraPuloAleatorio() {
        List<Pulo> pulos = Arrays.asList(new PuloBaixo(), new PuloMedio(), new PuloAlto());
        int index = new Random().nextInt(pulos.toArray().length);

        return pulos.get(index);
    }
}

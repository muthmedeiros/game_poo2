import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EstadoFactory {
    public static Estado geraEstado(Pessoa pessoa) {
        List<Estado> ataques = Arrays.asList(new Fraco(pessoa), new Normal(pessoa), new Forte(pessoa));
        int index = new Random().nextInt(ataques.toArray().length);

        return ataques.get(index);
    }
}

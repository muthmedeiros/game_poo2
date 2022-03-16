import java.awt.*;
import java.util.Random;

public class CoordenadaFactory {
    public static Point geraCoordenadaAleatoria() {
        return new Point(new Random().nextInt(0,100), new Random().nextInt(0,100));
    }
}

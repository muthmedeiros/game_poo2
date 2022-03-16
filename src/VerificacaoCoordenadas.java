import java.awt.*;

public class VerificacaoCoordenadas {
    public static boolean podeAtacar(Point coordenadas1, Point coordenadas2) {
        return ((coordenadas2.x - coordenadas1.x) == 0) && ((coordenadas2.y - coordenadas1.y) == 0);
    }
}

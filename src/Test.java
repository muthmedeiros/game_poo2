import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws Exception {
        Jogo jogo = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de jogo (1 - Normal / 2 - Avançado)");
        String gameType = scanner.nextLine();

        if (Objects.equals(gameType, "1")) {
            jogo = new PersonagemSimplesFactory();
        } else if (Objects.equals(gameType, "2")) {
            jogo = new PersonagemAvancadoFactory();
        }
        else {
            throw new Exception("Opção inválida!");
        }

        System.out.println("Digite o nome do personagem: ");

        String nome = scanner.nextLine();

        jogo.jogar(nome);
    }
}

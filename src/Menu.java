import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private final Conversor conversor;

    public Menu(Scanner scanner, Conversor conversor) {
        this.scanner = scanner;
        this.conversor = conversor;
    }

    public void exibirMenu() {
        String[][] opcoes = {
                {"USD", "BRL"},
                {"BRL", "USD"},
                {"USD", "EUR"},
                {"EUR", "USD"},
                {"USD", "JPY"},
                {"JPY", "USD"}
        };

        while (true) {
            System.out.println("\n=== CONVERSOR DE MOEDAS ===");
            System.out.println("1. USD → BRL");
            System.out.println("2. BRL → USD");
            System.out.println("3. USD → EUR");
            System.out.println("4. EUR → USD");
            System.out.println("5. USD → JPY");
            System.out.println("6. JPY → USD");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            int escolha = scanner.nextInt();

            if (escolha == 0) break;
            if (escolha < 1 || escolha > opcoes.length) {
                System.out.println("Opção inválida!");
                continue;
            }

            String origem = opcoes[escolha - 1][0];
            String destino = opcoes[escolha - 1][1];

            System.out.print("Digite o valor a converter: ");
            double valor = scanner.nextDouble();

            double convertido = conversor.converter(origem, destino, valor);
            System.out.printf("%.2f %s = %.2f %s\n", valor, origem, convertido, destino);
        }
    }
}

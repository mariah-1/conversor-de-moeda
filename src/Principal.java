import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();
        Menu menu = new Menu(scanner, conversor);

        menu.exibirMenu();

        scanner.close();
        System.out.println("Programa encerrado.");
    }
}

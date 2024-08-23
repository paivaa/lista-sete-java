import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho máximo do histórico: ");
        int maxSize = Integer.parseInt(scanner.nextLine());

        BrowserHistory history = new BrowserHistory(maxSize);

        String command;
        do {
            System.out.println("\nSimulador de Histórico de Navegação:");
            System.out.println("1. Visitar nova URL");
            System.out.println("2. Exibir histórico");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Informe a URL: ");
                    String url = scanner.nextLine();
                    history.visit(url);
                    break;
                case "2":
                    history.printHistory();
                    break;
                case "3":
                    System.out.println("Saindo do simulador...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!command.equals("3"));

        scanner.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeImpressao gerenciador = new GerenciadorDeImpressao();

        String command;
        do {
            System.out.println("\nSistema de Gerenciamento de Impressão:");
            System.out.println("1. Adicionar trabalho de impressão");
            System.out.println("2. Processar próximo trabalho de impressão");
            System.out.println("3. Mostrar trabalhos na fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Digite o nome do documento: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número de páginas: ");
                    int paginas = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha
                    gerenciador.adicionarTrabalho(nome, paginas);
                    break;
                case "2":
                    gerenciador.processarProximoTrabalho();
                    break;
                case "3":
                    gerenciador.mostrarFila();
                    break;
                case "4":
                    System.out.println("Encerrando o sistema de gerenciamento de impressão...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!command.equals("4"));

        scanner.close();
    }
}
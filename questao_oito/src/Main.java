import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciadorDeProcessos gerenciador = new GerenciadorDeProcessos();

        String command;
        do {
            System.out.println("\nSimulador de Fila de Processos:");
            System.out.println("1. Adicionar processo à fila");
            System.out.println("2. Executar próximo processo");
            System.out.println("3. Mostrar processos na fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Digite o nome do processo: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a prioridade do processo: ");
                    int prioridade = scanner.nextInt();
                    scanner.nextLine();  // Consumir a nova linha
                    gerenciador.adicionarProcesso(nome, prioridade);
                    break;
                case "2":
                    gerenciador.executarProcesso();
                    break;
                case "3":
                    gerenciador.mostrarFila();
                    break;
                case "4":
                    System.out.println("Encerrando o simulador de fila de processos...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!command.equals("4"));

        scanner.close();
    }
}
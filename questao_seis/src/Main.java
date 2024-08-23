import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FilaDeAtendimento filaDeAtendimento = new FilaDeAtendimento();

        String command;
        do {
            System.out.println("\nSimulador de Fila de Atendimento:");
            System.out.println("1. Adicionar cliente à fila");
            System.out.println("2. Chamar próximo cliente");
            System.out.println("3. Mostrar clientes na fila");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    filaDeAtendimento.adicionarCliente(nome);
                    break;
                case "2":
                    filaDeAtendimento.chamarProximoCliente();
                    break;
                case "3":
                    filaDeAtendimento.mostrarFila();
                    break;
                case "4":
                    System.out.println("Encerrando o simulador...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!command.equals("4"));

        scanner.close();
    }
}
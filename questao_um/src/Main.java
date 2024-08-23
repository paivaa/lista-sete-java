import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList();
        Scanner scanner = new Scanner(System.in);
        String command;

        do {
            System.out.println("\nGerenciador de Tarefas:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Marcar Tarefa como Concluída");
            System.out.println("4. Listar Tarefas");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Descrição da tarefa: ");
                    String description = scanner.nextLine();
                    taskList.addTask(description);
                    break;
                case "2":
                    System.out.print("Índice da tarefa a ser removida: ");
                    int removeIndex = Integer.parseInt(scanner.nextLine());
                    taskList.removeTask(removeIndex);
                    break;
                case "3":
                    System.out.print("Índice da tarefa a ser marcada como concluída: ");
                    int completeIndex = Integer.parseInt(scanner.nextLine());
                    taskList.markTaskAsCompleted(completeIndex);
                    break;
                case "4":
                    System.out.println("Lista de Tarefas:");
                    taskList.printTasks();
                    break;
                case "5":
                    System.out.println("Saindo do Gerenciador de Tarefas...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!command.equals("5"));

        scanner.close();
    }
}
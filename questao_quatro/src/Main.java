import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        String command;
        do {
            System.out.println("\nEditor de Texto:");
            System.out.println("1. Escrever texto");
            System.out.println("2. Desfazer última ação");
            System.out.println("3. Refazer última ação desfeita");
            System.out.println("4. Exibir texto atual");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Digite o texto: ");
                    String newText = scanner.nextLine();
                    editor.write(newText);
                    break;
                case "2":
                    editor.undo();
                    break;
                case "3":
                    editor.redo();
                    break;
                case "4":
                    editor.printText();
                    break;
                case "5":
                    System.out.println("Saindo do editor...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!command.equals("5"));

        scanner.close();
    }
}
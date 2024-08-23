import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hand hand = new Hand();

        String command;
        do {
            System.out.println("\nJogo de Cartas:");
            System.out.println("1. Adicionar carta");
            System.out.println("2. Remover carta");
            System.out.println("3. Mover carta");
            System.out.println("4. Mostrar mão");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    System.out.print("Digite o valor da carta: ");
                    String cardValue = scanner.nextLine();
                    hand.addCard(cardValue);
                    break;
                case "2":
                    System.out.print("Digite o valor da carta para remover: ");
                    String removeValue = scanner.nextLine();
                    hand.removeCard(removeValue);
                    break;
                case "3":
                    System.out.print("Digite o valor da carta para mover: ");
                    String moveValue = scanner.nextLine();
                    System.out.print("Digite a nova posição: ");
                    int newPosition = scanner.nextInt();
                    scanner.nextLine();  // Consumir nova linha
                    hand.moveCard(moveValue, newPosition);
                    break;
                case "4":
                    hand.showHand();
                    break;
                case "5":
                    System.out.println("Saindo do jogo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (!command.equals("5"));

        scanner.close();
    }
}
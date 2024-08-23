class UndoManager {
    private Action head;

    // Adiciona uma nova ação na lista
    public void addAction(String text) {
        Action newAction = new Action(text);
        newAction.next = head;
        head = newAction;
        System.out.println("Ação realizada: " + text);
    }

    // Desfaz a última ação
    public String undo() {
        if (head == null) {
            return "Nenhuma ação para desfazer.";
        }

        String undoneAction = head.text;
        head = head.next;
        return "Desfeita a última ação: " + undoneAction;
    }

    // Exibe todas as ações realizadas (para fins de depuração)
    public void printActions() {
        if (head == null) {
            System.out.println("Nenhuma ação realizada.");
            return;
        }

        Action current = head;
        System.out.println("Ações realizadas:");
        while (current != null) {
            System.out.println(current.text);
            current = current.next;
        }
    }
}
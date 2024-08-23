class UndoRedoManager {
    private Action currentAction;

    public UndoRedoManager() {
        this.currentAction = null;
    }

    // Adiciona uma nova ação na lista e limpa as ações futuras (refazer)
    public void addAction(String text) {
        Action newAction = new Action(text);
        if (currentAction != null) {
            currentAction.next = newAction;
            newAction.prev = currentAction;
        }
        currentAction = newAction;
        System.out.println("Ação realizada: " + text);
    }

    // Desfaz a última ação
    public String undo() {
        if (currentAction == null) {
            return "Nenhuma ação para desfazer.";
        }

        String undoneText = currentAction.text;
        currentAction = currentAction.prev;
        return "Desfeita a última ação: " + undoneText;
    }

    // Refaz a próxima ação
    public String redo() {
        if (currentAction == null || currentAction.next == null) {
            return "Nenhuma ação para refazer.";
        }

        currentAction = currentAction.next;
        return "Ação refeita: " + currentAction.text;
    }

    // Retorna o texto atual (todas as ações até o momento atual)
    public String getText() {
        StringBuilder text = new StringBuilder();
        Action temp = currentAction;

        while (temp != null && temp.prev != null) {
            temp = temp.prev;
        }

        while (temp != null) {
            text.append(temp.text);
            temp = temp.next;
        }

        return text.toString();
    }
}
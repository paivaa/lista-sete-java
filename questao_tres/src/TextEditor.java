class TextEditor {
    private StringBuilder text;
    private UndoManager undoManager;

    public TextEditor() {
        this.text = new StringBuilder();
        this.undoManager = new UndoManager();
    }

    // Adiciona texto ao editor e registra a ação
    public void write(String newText) {
        text.append(newText);
        undoManager.addAction(newText);
        System.out.println("Texto atual: " + text.toString());
    }

    // Desfaz a última ação de edição
    public void undo() {
        String undoneText = undoManager.undo();
        if (!undoneText.contains("Nenhuma ação para desfazer")) {
            int lengthToRemove = undoneText.length() - 22; // Ajuste do texto desfeito
            text.delete(text.length() - lengthToRemove, text.length());
        }
        System.out.println("Texto após desfazer: " + text.toString());
    }

    // Exibe o texto atual no editor
    public void printText() {
        System.out.println("Texto atual: " + text.toString());
    }
}
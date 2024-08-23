class TextEditor {
    private UndoRedoManager undoRedoManager;

    public TextEditor() {
        this.undoRedoManager = new UndoRedoManager();
    }

    // Adiciona texto ao editor e registra a ação
    public void write(String newText) {
        undoRedoManager.addAction(newText);
        System.out.println("Texto atual: " + undoRedoManager.getText());
    }

    // Desfaz a última ação de edição
    public void undo() {
        System.out.println(undoRedoManager.undo());
        System.out.println("Texto após desfazer: " + undoRedoManager.getText());
    }

    // Refaz a última ação desfeita
    public void redo() {
        System.out.println(undoRedoManager.redo());
        System.out.println("Texto após refazer: " + undoRedoManager.getText());
    }

    // Exibe o texto atual no editor
    public void printText() {
        System.out.println("Texto atual: " + undoRedoManager.getText());
    }
}
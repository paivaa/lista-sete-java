class BrowserHistory {
    private Node head;
    private int size;
    private final int maxSize;

    public BrowserHistory(int maxSize) {
        this.head = null;
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Adiciona uma nova URL ao histórico
    public void visit(String url) {
        Node newNode = new Node(url);

        if (size == 0) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;

        // Remove a URL mais antiga se o tamanho máximo for excedido
        if (size > maxSize) {
            removeOldest();
        }

        System.out.println("Visitado: " + url);
    }

    // Remove a URL mais antiga do histórico
    private void removeOldest() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            System.out.println("Removido: " + current.next.url);
            current.next = null;
        }
        size--;
    }

    // Exibe o histórico de navegação
    public void printHistory() {
        if (head == null) {
            System.out.println("Histórico vazio.");
            return;
        }

        Node current = head;
        System.out.println("Histórico de Navegação:");
        while (current != null) {
            System.out.println(current.url);
            current = current.next;
        }
    }
}
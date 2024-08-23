class Hand {
    private Card head;
    private Card tail;

    public Hand() {
        this.head = null;
        this.tail = null;
    }

    // Adiciona uma nova carta à mão
    public void addCard(String value) {
        Card newCard = new Card(value);
        if (head == null) {
            head = newCard;
            tail = newCard;
        } else {
            tail.next = newCard;
            newCard.prev = tail;
            tail = newCard;
        }
        System.out.println("Carta adicionada: " + value);
    }

    // Remove uma carta específica da mão
    public void removeCard(String value) {
        Card current = head;

        while (current != null) {
            if (current.value.equals(value)) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    tail = current.prev;
                }

                System.out.println("Carta removida: " + value);
                return;
            }
            current = current.next;
        }
        System.out.println("Carta não encontrada: " + value);
    }

    // Move uma carta para uma nova posição na mão
    public void moveCard(String value, int newPosition) {
        Card current = head;
        int currentPosition = 1;

        // Encontrar a carta na posição atual
        while (current != null) {
            if (current.value.equals(value)) {
                break;
            }
            current = current.next;
            currentPosition++;
        }

        if (current == null) {
            System.out.println("Carta não encontrada: " + value);
            return;
        }

        // Remover a carta da posição atual
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        } else {
            tail = current.prev;
        }

        // Recolocar a carta na nova posição
        if (newPosition <= 1) {
            current.next = head;
            head.prev = current;
            head = current;
            current.prev = null;
        } else {
            Card temp = head;
            for (int i = 1; i < newPosition - 1 && temp.next != null; i++) {
                temp = temp.next;
            }

            current.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = current;
            }
            temp.next = current;
            current.prev = temp;

            if (current.next == null) {
                tail = current;
            }
        }
        System.out.println("Carta movida: " + value + " para a posição " + newPosition);
    }

    // Exibe as cartas na mão
    public void showHand() {
        if (head == null) {
            System.out.println("A mão está vazia.");
            return;
        }

        System.out.print("Cartas na mão: ");
        Card current = head;
        while (current != null) {
            System.out.print(current + " ");
            current = current.next;
        }
        System.out.println();
    }
}
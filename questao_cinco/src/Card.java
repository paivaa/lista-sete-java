class Card {
    String value;
    Card prev;
    Card next;

    public Card(String value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return value;
    }
}
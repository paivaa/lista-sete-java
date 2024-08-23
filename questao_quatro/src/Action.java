class Action {
    String text;
    Action prev;
    Action next;

    public Action(String text) {
        this.text = text;
        this.prev = null;
        this.next = null;
    }
}
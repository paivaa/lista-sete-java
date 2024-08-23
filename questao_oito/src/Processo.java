class Processo {
    private String nome;
    private int prioridade;

    public Processo(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    @Override
    public String toString() {
        return "Processo: " + nome + " | Prioridade: " + prioridade;
    }
}

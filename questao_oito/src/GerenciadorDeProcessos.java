import java.util.LinkedList;
import java.util.Queue;

class GerenciadorDeProcessos {
    private Queue<Processo> filaDeProcessos;

    public GerenciadorDeProcessos() {
        this.filaDeProcessos = new LinkedList<>();
    }

    // Adiciona um novo processo à fila
    public void adicionarProcesso(String nome, int prioridade) {
        Processo novoProcesso = new Processo(nome, prioridade);
        filaDeProcessos.add(novoProcesso);
        System.out.println("Processo adicionado: " + novoProcesso);
    }

    // Remove e retorna o processo mais antigo da fila para execução
    public void executarProcesso() {
        Processo processo = filaDeProcessos.poll(); // Remove e retorna o processo mais antigo
        if (processo != null) {
            System.out.println("Executando " + processo);
        } else {
            System.out.println("Não há processos na fila.");
        }
    }

    // Exibe os processos que estão na fila
    public void mostrarFila() {
        if (filaDeProcessos.isEmpty()) {
            System.out.println("A fila de processos está vazia.");
        } else {
            System.out.println("Processos na fila:");
            for (Processo processo : filaDeProcessos) {
                System.out.println(processo);
            }
        }
    }
}
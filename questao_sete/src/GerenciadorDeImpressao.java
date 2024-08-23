import java.util.LinkedList;
import java.util.Queue;

class GerenciadorDeImpressao {
    private Queue<TrabalhoDeImpressao> filaDeImpressao;

    public GerenciadorDeImpressao() {
        this.filaDeImpressao = new LinkedList<>();
    }

    // Adiciona um novo trabalho de impressão à fila
    public void adicionarTrabalho(String nomeDoDocumento, int numeroDePaginas) {
        TrabalhoDeImpressao novoTrabalho = new TrabalhoDeImpressao(nomeDoDocumento, numeroDePaginas);
        filaDeImpressao.add(novoTrabalho);
        System.out.println("Trabalho adicionado: " + novoTrabalho);
    }

    // Processa o próximo trabalho de impressão na fila
    public void processarProximoTrabalho() {
        TrabalhoDeImpressao trabalho = filaDeImpressao.poll(); // Remove e retorna o próximo trabalho
        if (trabalho != null) {
            System.out.println("Processando " + trabalho);
            // Simular o tempo de impressão
            try {
                Thread.sleep(trabalho.getNumeroDePaginas() * 1000); // 1 segundo por página
            } catch (InterruptedException e) {
                System.out.println("Erro na simulação de impressão.");
            }
            System.out.println("Impressão concluída: " + trabalho.getNomeDoDocumento());
        } else {
            System.out.println("Não há trabalhos de impressão na fila.");
        }
    }

    // Exibe os trabalhos na fila de impressão
    public void mostrarFila() {
        if (filaDeImpressao.isEmpty()) {
            System.out.println("A fila de impressão está vazia.");
        } else {
            System.out.println("Trabalhos na fila de impressão:");
            for (TrabalhoDeImpressao trabalho : filaDeImpressao) {
                System.out.println(trabalho);
            }
        }
    }
}

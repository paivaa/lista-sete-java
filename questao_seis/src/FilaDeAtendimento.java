import java.util.LinkedList;
import java.util.Queue;

class FilaDeAtendimento {
    private Queue<Cliente> fila;
    private int proximaSenha;

    public FilaDeAtendimento() {
        this.fila = new LinkedList<>();
        this.proximaSenha = 1;
    }

    // Adiciona um novo cliente à fila
    public void adicionarCliente(String nome) {
        Cliente novoCliente = new Cliente(nome, proximaSenha++);
        fila.add(novoCliente);
        System.out.println("Cliente adicionado: " + novoCliente);
    }

    // Chama o próximo cliente para atendimento
    public void chamarProximoCliente() {
        Cliente clienteAtendido = fila.poll(); // Remove e retorna o próximo cliente
        if (clienteAtendido != null) {
            System.out.println("Atendendo " + clienteAtendido);
        } else {
            System.out.println("Não há clientes na fila.");
        }
    }

    // Exibe os clientes que estão na fila
    public void mostrarFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("Clientes na fila:");
            for (Cliente cliente : fila) {
                System.out.println(cliente);
            }
        }
    }
}

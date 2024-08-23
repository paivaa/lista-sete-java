class TaskList {
    private Task head;

    public void addTask(String description) {
        Task newTask = new Task(description);
        if (head == null) {
            head = newTask;
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("Tarefa adicionada: " + description);
    }

    public void removeTask(int index) {
        if (head == null) {
            System.out.println("A lista de tarefas está vazia.");
            return;
        }

        if (index == 0) {
            System.out.println("Tarefa removida: " + head.description);
            head = head.next;
            return;
        }

        Task current = head;
        Task previous = null;
        int count = 0;

        while (current != null && count != index) {
            previous = current;
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Índice fora do alcance.");
        } else {
            System.out.println("Tarefa removida: " + current.description);
            previous.next = current.next;
        }
    }

    public void markTaskAsCompleted(int index) {
        Task current = head;
        int count = 0;

        while (current != null && count != index) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Índice fora do alcance.");
        } else {
            current.markAsCompleted();
            System.out.println("Tarefa marcada como concluída: " + current.description);
        }
    }

    public void printTasks() {
        if (head == null) {
            System.out.println("Nenhuma tarefa na lista.");
            return;
        }

        Task current = head;
        int index = 0;

        while (current != null) {
            System.out.println(index + ": " + current);
            current = current.next;
            index++;
        }
    }
}

public class GerenciadorTarefas {
    private Tarefa[] tarefas;
    private int contador;

    public GerenciadorTarefas() {
        tarefas = new Tarefa[50];
        contador = 0;
    }

    public void adicionarTarefa(Tarefa tarefa) {
        if (contador < tarefas.length) {
            tarefas[contador++] = tarefa;
        } else {
            System.out.println("Lista de tarefas cheia. Não é possível adicionar mais tarefas.");
        }
    }

    public void removerTarefa(int posicao) {
        if (posicao >= 0 && posicao < contador) {
            tarefas[posicao] = tarefas[contador - 1];
            tarefas[contador - 1] = null;
            contador--;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void marcarConcluida(int posicao) {
        if (posicao >= 0 && posicao < contador) {
            tarefas[posicao].marcarConcluida();
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void listarTarefas() {
        System.out.println("Tarefas Pendentes:");
        for (int i = 0; i < contador; i++) {
            if (tarefas[i].getStatus().equals("pendente")) {
                System.out.println(tarefas[i]);
            }
        }
        
        System.out.println("\nTarefas Concluídas:");
        for (int i = 0; i < contador; i++) {
            if (tarefas[i].getStatus().equals("concluída")) {
                System.out.println(tarefas[i]);
            }
        }
    }

    public void listarTarefasPrioridade(String prioridade) {
        System.out.println("Tarefas com prioridade " + prioridade + ":");
        for (int i = 0; i < contador; i++) {
            if (tarefas[i].getPrioridade().equalsIgnoreCase(prioridade)) {
                System.out.println(tarefas[i]);
            }
        }
    }
}

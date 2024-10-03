public class App {
    public static void main(String[] args) {
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();

        
        Tarefa tarefa1 = new Tarefa("Estudar aula1 Ale", "alta");
        Tarefa tarefa2 = new Tarefa("Estudar aula2 Ale", "média");
        Tarefa tarefa3 = new Tarefa("Estudar aula mobile Ale", "baixa");

        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        gerenciador.adicionarTarefa(tarefa3);

        
        gerenciador.listarTarefas();

       
        gerenciador.marcarConcluida(0); 

        System.out.println("\nApós marcar a tarefa como concluída:");
        gerenciador.listarTarefas();

       
        System.out.println("\nListando tarefas de prioridade alta:");
        gerenciador.listarTarefasPrioridade("alta");

       
        gerenciador.removerTarefa(1); 

        System.out.println("\nApós remover uma tarefa:");
        gerenciador.listarTarefas();
    }
}

import java.util.ArrayList;

public class Main{


    public static void main(String[] args){

        ArrayList<Tarefa> tarefas = new ArrayList<>();

        tarefas.add(new Tarefa("Ler", false)); //0
        tarefas.add(new Tarefa("Jogar", true)); //1
        tarefas.add(new Tarefa("Assistir", false)); //2
        tarefas.add(new Tarefa("Treinar", true));
        tarefas.add(new Tarefa("dormir", false));
        tarefas.add(new Tarefa("comer", true));
        tarefas.add(new Tarefa("Estudar", false)); // adicionar novas tarefas.

        tarefas.remove(0); // Para remover algumas tarefa,

        tarefas.get(0).setTarefa("Ler um livro");//alterar alguma tarefa

        int i = 0;
        for(Tarefa t: tarefas){ //listar todas as tarefas com seus estados;
            i++;
            System.out.printf("Tarefa %d - %s: \n ===Feita(sim-true/não-false): %b \n",i, t.getTarefa(), t.getEstado());
        }

        


    }


}
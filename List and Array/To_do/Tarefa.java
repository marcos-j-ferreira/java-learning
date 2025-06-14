class Tarefa{

    private String tarefa;

    private boolean estado; 

    Tarefa(String tarefa, boolean estado){
        this.tarefa = tarefa;
        this.estado = estado;
    }

    protected final String getTarefa(){
        return tarefa;
    }

    protected final boolean getEstado(){
        return estado;
    }

    protected final void setTarefa(String tarefa){
       this.tarefa = tarefa;
    }

    protected final void setEstado(boolean estado){
        this.estado = estado;
    }
}
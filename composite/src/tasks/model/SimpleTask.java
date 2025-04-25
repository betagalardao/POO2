package tasks.model;

public class SimpleTask implements Task{
    private String taskName;

    public SimpleTask(String taskName){
        this.taskName = taskName;
    }

    @Override 
    public void print(String structure){
        System.out.println(structure + "Tarefa simples: " + taskName);
    }
}
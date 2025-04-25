package tasks.model;

import java.util.List;

public class CompositeTask implements Task{
    private String taskName;
    private List<Task> subTasks;

    public CompositeTask(String taskName, List<Task> subTasks){
        this.taskName = taskName;
        this.subTasks = subTasks;
    }

    @Override
    public void print(String structure){
        System.out.println(structure + "Tarefa Composta: " +taskName);
        for (Task subTasks : subTasks){
            subTasks.print(structure + " | ");
        }
    }
}
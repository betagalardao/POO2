package tasks;

import java.util.ArrayList;
import java.util.List;
import tasks.model.Task;

public class TaskManager{
    private List<Task> tasks;

    public TaskManager(){
        tasks = new ArrayList<>();
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void listTasks(){
        for (Task task : tasks){
            task.print("");
        }
    }
}

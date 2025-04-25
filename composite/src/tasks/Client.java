package tasks;

import java.util.Arrays;
import tasks.model.SimpleTask;
import tasks.model.CompositeTask;

public class Main{
    public static void main(String[] args){
        TaskManager taskManager = new TaskManager();

        SimpleTask task1 = new SimpleTask("Fazer compras");
        SimpleTask task2 = new SimpleTask("Fazer tarefa de POO2");

        CompositeTask compositeTask = new CompositeTask("Pagar conta de luz", Arrays.asList(
        new SimpleTask("Pagar conta do celular"),
        new SimpleTask("Pagar cartão"),
        new SimpleTask("Pagar conta de água")
        ));

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(compositeTask);

        System.out.println("Lista de tarefas:");
        taskManager.listTasks();
    }
}

package org.example.models.set.listtasks;

import java.util.HashSet;
import java.util.Set;

public class ListTasks {

    private Set<Task> listTask;

    public ListTasks() {
        this.listTask = new HashSet<>();
    }

    public void addTask(String description, boolean doneOrNo){
        listTask.add(new Task(description, doneOrNo));
    }

    public void removeTask(String description) {
        Task taskForRemove = null;
        for(Task t: listTask){
            if(t.getDescription().equalsIgnoreCase(description)){
                taskForRemove = t;
                break;
            }
        }
        listTask.remove(taskForRemove);
    }

    public void showTasks(){
        System.out.println(listTask);
    }

    public void countTasks(){
        System.out.println("Existem no total " + listTask.size() + " tasks.");
    }

    public void getTasksDone(){
        Set<Task> listTasksDone = new HashSet<>();
        for(Task t: listTask) {
            if(t.isDone() == true){
                listTasksDone.add(t);
            }
        }
        System.out.println("Tasks done!");
        System.out.println(listTasksDone);
    }

    public void getTasksNotDone(){
        Set<Task> listTasksDone = new HashSet<>();
        for(Task t: listTask) {
            if(t.isDone() == false){
                listTasksDone.add(t);
            }
        }
        System.out.println("Tasks not done!");
        System.out.println(listTasksDone);
    }

    public void markTaskDone(String description ){
        Task taskDone = null;
        for(Task t: listTask){
            if(t.getDescription() == description){
                t.setDone(true);
                taskDone = t;
            }
        }
        System.out.println("Task marked done: " + taskDone);
    }

    public void markTaskNotDone(String description ){
        Task taskDone = null;
        for(Task t: listTask){
            if(t.getDescription() == description){
                t.setDone(false);
                taskDone = t;
            }
        }
        System.out.println("Task marked Not done: " + taskDone);
    }

    public void cleanAllListTasks(){
        listTask.removeAll(listTask);
    }

    public static void main(String[] args) {
        ListTasks listTasks = new ListTasks();
        listTasks.addTask("Limpar mesa", false);
        listTasks.addTask("Escovar dentes", true);
        listTasks.addTask("Tomar banho", true);
        listTasks.addTask("Lavar louça", false);
        listTasks.addTask("Fazer exercícios", true);

        listTasks.showTasks();
        listTasks.removeTask("Limpar mesa");
        listTasks.showTasks();
        listTasks.countTasks();
        listTasks.getTasksDone();
        listTasks.getTasksNotDone();
        listTasks.markTaskDone("Lavar louça");
        listTasks.markTaskNotDone("Tomar banho");
        listTasks.cleanAllListTasks();
        listTasks.showTasks();

    }
}

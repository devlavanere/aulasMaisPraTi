package lesson7_java_ed.simpleLinkedList.exercicio_01;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Buy food");
        manager.addTask("Read a book");
        manager.displayTasks();
        manager.markTaskAsCompleted("Read a book");
        manager.displayTasks();
        manager.removeTask("Buy food");
        manager.displayTasks();
    }
}

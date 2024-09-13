package lesson7_java_ed.simpleLinkedList.exercicio_01;

public class TaskManager {
    private Task head;

    public void addTask(String description) {
        Task newTask = new Task(description);
        if(head == null) {
            head = newTask;
        }else {
            Task current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newTask;
        }
        System.out.println("Task added: " + description);
    }

    public void removeTask(String description) {
        if(head == null) {
            System.out.println("No tasks to remove.");
            return;
        }

        if(head.description.equals(description)) {
            head = head.next;
            System.out.println("Task removed: " + description);
            return;
        }

        Task current = head;
        while(current.next != null && !current.next.description.equals(description)) {
            current = current.next;
        }

        if(current.next == null) {
            System.out.println("Task not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Task removed: " + description);
        }
    }

    public void markTaskAsCompleted(String description) {
        Task current = head;
        while(current != null) {
            if(current.description.equals(description)) {
                current.markAsCompleted();
                System.out.println("Task marked as completed: " + description);
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found.");
    }

    public void displayTasks() {
        if(head == null) {
            System.out.println("No tasks.");
            return;
        }
        Task current = head;
        while(current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}
























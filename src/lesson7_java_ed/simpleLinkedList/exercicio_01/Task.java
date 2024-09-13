package lesson7_java_ed.simpleLinkedList.exercicio_01;

public class Task {
    String description;
    boolean isCompleted;
    Task next;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
        this.next = null;
    }

    public void markAsCompleted() {
        this.isCompleted = true;
    }

    @Override
    public String toString() {
        return (isCompleted ? "[x]" : "[]") + description;
    }
}


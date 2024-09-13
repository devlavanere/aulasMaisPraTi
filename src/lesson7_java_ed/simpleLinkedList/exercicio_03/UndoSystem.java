package lesson7_java_ed.simpleLinkedList.exercicio_03;

public class UndoSystem {
    private Action head;

    public void addAction(String action) {
        Action newAction = new Action(action);
        newAction.next = head;
        head = newAction;
        System.out.println("Action performed: " + action);
    }

    public void undo() {
        if(head == null) {
            System.out.println("No actions to undo.");
            return;
        }
        System.out.println("Undo action: " + head.action);
        head = head.next;
    }

    public void displayActions() {
        if (head == null) {
            System.out.println("No actions performed");
            return;
        }
        Action current = head;
        while(current != null) {
            System.out.println(current.action);
            current = current.next;
        }
    }
}

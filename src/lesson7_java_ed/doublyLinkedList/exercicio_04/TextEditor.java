package lesson7_java_ed.doublyLinkedList.exercicio_04;

public class TextEditor {
    private ActionNode head;
    private ActionNode current;

    public TextEditor() {
        this.head = null;
        this.current = null;
    }

    // Adiciona uma nova ação e redefine a lista de redo
    public void addAction(String action) {
        ActionNode newNode = new ActionNode(action);
        if(head == null) {
            head = newNode;
            current = head;
        } else {
            newNode.prev = current;
            current.next = newNode;
            current = newNode;
        }
        System.out.println("Action performed: " + action);
    }

    // Desfaz a última ação
    public void undo() {
        if(current == null) {
            System.out.println("No actions to undo.");
            return;
        }
        System.out.println("Undo action: " + current.action);
        current = current.prev;
    }

    // Refaz a próxima ação se possível
    public void redo() {
        if(current == null || current.next == null) {
            System.out.println("No action to redo.");
            return;
        }
        current = current.next;
        System.out.println("Redo action: " + current.action);
    }

    // Exibe todas ações realizadas até o momento
    public void displayActions() {
        if(head == null) {
            System.out.println("No actions performed.");
            return;
        }
        ActionNode temp = head;
        while(temp != null) {
            System.out.println((temp == current ? ">>" : "  ") + temp.action);
            temp = temp.next;
        }
    }
}

package lesson7_java_ed.doublyLinkedList.exercicio_04;

public class ActionNode {
    String action;
    ActionNode next;
    ActionNode prev;

    public ActionNode(String action) {
        this.action = action;
        this.next = null;
        this.prev = null;
    }
}

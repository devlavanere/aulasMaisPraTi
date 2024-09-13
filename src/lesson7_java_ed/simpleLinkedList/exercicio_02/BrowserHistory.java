package lesson7_java_ed.simpleLinkedList.exercicio_02;

class BrowserHistory {
    class Node {
        String url;
        Node next;

        Node(String url) {
            this.url = url;
            this.next = null;
        }
    }

    private Node head;
    private int size;
    private final int maxSize;

    public BrowserHistory(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.head = null;
    }

    public void visit(String url) {
        Node newNode = new Node(url);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
        if (size > maxSize) {
            removeOldest();
        }
        System.out.println("Visited: " + url);
    }

    private void removeOldest() {
        if (head != null) {
            head = head.next;
            size--;
            System.out.println("Oldest URL removed.");
        }
    }

    public void displayHistory() {
        if (head == null) {
            System.out.println("No browsing history.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.url);
            current = current.next;
        }
    }
}



package lists;

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(30);
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(40);

        System.out.println("Elemento no indice 0: " + list.get(0));
        System.out.println("Elemento no indice 1: " + list.get(1));
        System.out.println("Elemento no indice 2: " + list.get(2));
        System.out.println("Elemento no indice 3: " + list.get(3));
        System.out.println("Elemento no indice 4: " + list.get(4));

        list.remove(0);
        System.out.println("Elemento no indice 0: " + list.get(0)); // 10

        list.remove(1);
        System.out.println("Elemento no indice 1: " + list.get(1)); // 50

    }
}

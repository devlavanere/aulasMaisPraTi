package lesson7_java_ed.doublyLinkedList.exercicio_05;

public class CardGame {
    private CardNode head;

    // Adiciona uma carta à mão do jogador
    public void addCard(String card) {
        CardNode newCard = new CardNode(card);
        if (head == null) {
            head = newCard;
        } else {
            CardNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newCard;
            newCard.prev = current;
        }
        System.out.println("Card added: " + card);
    }

    // Remove uma carta específica da mão do jogador
    public void removeCard(String card) {
        if (head == null) {
            System.out.println("No cards to remove.");
            return;
        }

        CardNode current = head;
        while (current != null && !current.card.equals(card)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Card not found.");
            return;
        }

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next; // Remover o primeiro elemento
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        System.out.println("Card removed: " + card);
    }

    // Move uma carta para uma nova posição na lista
    public void moveCard(String card, int newPosition) {
        CardNode current = head;
        int index = 0;

        // Encontrar a carta
        while (current != null && !current.card.equals(card)) {
            current = current.next;
            index++;
        }

        if (current == null) {
            System.out.println("Card not found.");
            return;
        }

        // Remover a carta da posição atual
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }

        // Inserir a carta na nova posição
        CardNode temp = head;
        CardNode prev = null;
        int i = 0;

        while (temp != null && i < newPosition) {
            prev = temp;
            temp = temp.next;
            i++;
        }

        current.next = temp;
        current.prev = prev;

        if (prev != null) {
            prev.next = current;
        } else {
            head = current;
        }

        if (temp != null) {
            temp.prev = current;
        }

        System.out.println("Card moved to position " + newPosition + ": " + card);
    }

    // Exibe todas as cartas na mão do jogador
    public void displayHand() {
        if (head == null) {
            System.out.println("No cards in hand.");
            return;
        }
        CardNode current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}

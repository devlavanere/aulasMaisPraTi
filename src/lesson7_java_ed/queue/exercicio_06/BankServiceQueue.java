package lesson7_java_ed.queue.exercicio_06;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BankServiceQueue {
    public static void main(String[] args) {
        // Queue to manage clients waiting for service
        Queue<String> clientQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Menu options
            System.out.println("\n1. Add client to queue");
            System.out.println("2. Serve next client");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch(option) {
                case 1:
                    // Add a client to the queue
                    System.out.println("Enter client's name: ");
                    String client = scanner.nextLine();
                    clientQueue.add(client);
                    System.out.println(client + " was added to the queue.");
                    break;
                case 2:
                    // Serve the next client in the queue
                    if(clientQueue.isEmpty()) {
                        System.out.println("No clients in the queue ");
                    } else {
                        System.out.println("Serving " + clientQueue.poll());
                    }
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;

                default:
                    // Invalid option handling
                    System.out.println("Invalid option!");

            }
        } while(option != 3);

        scanner.close();
    }
}

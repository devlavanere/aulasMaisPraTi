package lesson7_java_ed.queue.exercicio_07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintJobManager {
    public static void main(String[] args) {
        // Queue to manage print jobs
        Queue<String> printQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Menu options
            System.out.println("\n1. Add print job");
            System.out.println("2. Process next print job");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    // Add a new print job to the queue
                    System.out.print("Enter the name of the print job: ");
                    String job = scanner.nextLine();
                    printQueue.add(job);
                    System.out.println("Print job '" + job + "' was added to the queue.");
                    break;

                case 2:
                    // Process the next print job in the queue
                    if (printQueue.isEmpty()) {
                        System.out.println("No print jobs in the queue.");
                    } else {
                        System.out.println("Processing print job: " + printQueue.poll());
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
        } while (option != 3);

        scanner.close();
    }
}


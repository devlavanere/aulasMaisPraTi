package lesson7_java_ed.queue.exercicio_08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ProcessManager {
    public static void main(String[] args) {
        // Queue to manage processes ready for execution
        Queue<String> processQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            // Menu options
            System.out.println("\n1. Add new process");
            System.out.println("2. Execute next process");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    // Add a new process to the queue
                    System.out.print("Enter the process name: ");
                    String process = scanner.nextLine();
                    processQueue.add(process);
                    System.out.println("Process '" + process + "' was added to the queue.");
                    break;

                case 2:
                    // Execute the next process in the queue
                    if (processQueue.isEmpty()) {
                        System.out.println("No processes in the queue.");
                    } else {
                        System.out.println("Executing process: " + processQueue.poll());
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


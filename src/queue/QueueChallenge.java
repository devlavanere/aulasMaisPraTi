package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DesafioFila {
    public static void main(String[] args) {
        // Criação da fila de clientes usando LinkedList
        Queue<String> filaClientes = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nSistema de Atendimento ao Cliente");
            System.out.println("1. Adicionar Cliente na Fila");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Remover Cliente da Fila");
            System.out.println("4. Exibir Fila de Clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o número

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = scanner.nextLine();
                    filaClientes.add(nomeCliente);
                    System.out.println("Cliente " + nomeCliente + " adicionado à fila.");
                    break;

                case 2:
                    if (!filaClientes.isEmpty()) {
                        String clienteAtendido = filaClientes.poll();
                        System.out.println("Atendendo o cliente: " + clienteAtendido);
                    } else {
                        System.out.println("Nenhum cliente na fila para atender.");
                    }
                    break;

                case 3:
                    if (!filaClientes.isEmpty()) {
                        System.out.println("Clientes na fila: " + filaClientes);
                    } else {
                        System.out.println("A fila está vazia.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }

}

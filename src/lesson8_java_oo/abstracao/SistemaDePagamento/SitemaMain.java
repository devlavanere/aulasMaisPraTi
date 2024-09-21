package lesson8_java_oo.abstracao.SistemaDePagamento;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SitemaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FormaPagamento formaPagamento = null;

        System.out.println("Bem-vindo ao Sistema de Pagamento!");
        System.out.println("Escolha uma forma de pagamento:");
        System.out.println("1 - Cartão de Crédito");
        System.out.println("2 - Boleto");
        System.out.println("3 - Pix");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        // Lógica para escolher a forma de pagamento
        switch (opcao) {
            case 1:
                System.out.println("Digite o número do cartão de crédito (16 dígitos):");
                String numeroCartao = scanner.nextLine();

                System.out.println("Digite o nome do titular:");
                String nomeTitular = scanner.nextLine();

                System.out.println("Digite a data de validade (MM/AA):");
                String dataValidade = scanner.nextLine();

                System.out.println("Digite o CVV (3 dígitos):");
                String cvv = scanner.nextLine();

                formaPagamento = new CartaoCredito(numeroCartao, nomeTitular, dataValidade, cvv);
                break;

            case 2:
                System.out.println("Digite o código de barras do boleto (10 dígitos):");
                String codigoBarras = scanner.nextLine();

                formaPagamento = new Boleto(codigoBarras);
                break;

            case 3:
                System.out.println("Digite a chave Pix:");
                String chavePix = scanner.nextLine();

                formaPagamento = new Pix(chavePix);
                break;

            default:
                System.out.println("Opção inválida.");
                return;
        }

        // Solicitar valor do pagamento

        double valor = 0.0;
        boolean valorValido = false;

        while (!valorValido) {
            try {
                System.out.println("Digite o valor do pagamento:");
                valor = scanner.nextDouble();
                valorValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor inválido. Por favor, insira um número da seguinte forma(200 ou 200,00.");
                scanner.next();
            }
        }

        // Processar o pagamento
        try {
            formaPagamento.processarPagamento(valor);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        scanner.close();
    }
}

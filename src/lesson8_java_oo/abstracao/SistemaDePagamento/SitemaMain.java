package lesson8_java_oo.abstracao.SistemaDePagamento;

public class SitemaMain {
    public static void main(String[] args) {
        try {
            // Criando diferentes formas de pagamento
            FormaPagamento cartaoCredito = new CartaoCredito("1234567890123456", "João Silva", "12/25", "123");
            FormaPagamento boleto = new Boleto("12345678901234567890123456789012345678901234567");
            FormaPagamento pix = new Pix("joao@email.com");

            // Processando pagamentos
            cartaoCredito.processarPagamento(250.00);
            boleto.processarPagamento(500.00);
            pix.processarPagamento(150.00);

            // Tentando processar um pagamento com informações incorretas
            FormaPagamento cartaoInvalido = new CartaoCredito("1234567890123456", "Maria", "12/23", "12");
            cartaoInvalido.processarPagamento(100.00);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

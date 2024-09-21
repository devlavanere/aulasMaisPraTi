package lesson8_java_oo.abstracao.SistemaDePagamento;

public class CartaoCredito extends FormaPagamento {

    private String numeroCartao;
    private String nomeTitular;
    private String dataValidade;
    private String cvv;

    public CartaoCredito(String numeroCartao, String nomeTitular, String dataValidade, String cvv) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
    }

    @Override
    public void processarPagamento(double valor) {
        if(validarPagamento()) {
            System.out.println("Pagamento de R$ " + valor + "processado com sucesso via Cartão de Crédito. ");
        } else {
            throw new IllegalArgumentException("Falha ao processar pagamento via Cartão de Cartão.");
        }
    }

    @Override
    public boolean validarPagamento() {
        return numeroCartao.length() == 16 && !nomeTitular.isEmpty() && cvv.length() == 3;
    }
}

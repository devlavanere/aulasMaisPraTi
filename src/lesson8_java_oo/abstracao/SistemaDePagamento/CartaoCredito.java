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
    public void processarPagamento(double valor) throws Exception {
        if(validarPagamento()) {
            System.out.println("Pagamento de R$"+ valor + " processado com sucesso via Cartão de Crédito. ");
        } else {
            throw new Exception("Falha ao processar pagamento via Cartão de Credito.");
        }
    }

    @Override
    public boolean validarPagamento() throws IllegalArgumentException {
        if (numeroCartao.length() != 16) {
            throw new IllegalArgumentException("Número do cartão de crédito inválido.");
        }
        if (nomeTitular.isEmpty()) {
            throw new IllegalArgumentException("Nome do titular do cartão não pode estar vazio.");
        }
        if (cvv.length() != 3) {
            throw new IllegalArgumentException("CVV do cartão inválido.");
        }
        return true;
    }
}

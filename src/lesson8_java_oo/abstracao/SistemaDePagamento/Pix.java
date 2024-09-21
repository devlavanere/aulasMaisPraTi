package lesson8_java_oo.abstracao.SistemaDePagamento;

public class Pix extends FormaPagamento{
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        if(validarPagamento()) {
            System.out.println("Pagamento de R$"+ valor + " realizado via Pix com sucesso.");
        } else {
            throw new IllegalArgumentException("Falha ao processar pagamento via Pix.");
        }
    }

    @Override
    public boolean validarPagamento() {
        if (chavePix.length() < 11 || chavePix.length() > 32) {
            throw new IllegalArgumentException("Chave Pix inválida.");
        }
        return true;
    }
}

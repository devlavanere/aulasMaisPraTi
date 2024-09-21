package lesson8_java_oo.abstracao.SistemaDePagamento;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) {
        if(validarPagamento()) {
            System.out.println("Boleto de R$"+ valor + " gerado com sucesso.");
        } else {
            throw new IllegalArgumentException("Falha ao gerar boleto.");
        }
    }

    @Override
    public boolean validarPagamento() {
        if (codigoBarras.length() != 47) {
            throw new IllegalArgumentException("Código de barras inválido.");
        }
        return true;
    }
}

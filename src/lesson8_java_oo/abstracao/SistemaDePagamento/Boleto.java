package lesson8_java_oo.abstracao.SistemaDePagamento;

public class Boleto extends FormaPagamento {
    private String codigoBarras;

    public Boleto(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void processarPagamento(double valor) throws Exception{
        if(validarPagamento()) {
            System.out.println("Boleto de R$"+ valor + " gerado com sucesso.");
        } else {
            throw new Exception("Erro ao gerar boleto.");
        }
    }

    @Override
    public boolean validarPagamento() throws IllegalArgumentException{
        if (codigoBarras.length() != 10) {
            throw new IllegalArgumentException("Código de barras inválido.");
        }
        return true;
    }
}

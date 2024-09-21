package lesson8_java_oo.abstracao.SistemaDePagamento;

public abstract class FormaPagamento {

    public abstract void processarPagamento(double valor) throws Exception;
    public abstract boolean validarPagamento() throws Exception;
}

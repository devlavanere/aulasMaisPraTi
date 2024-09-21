package lesson8_java_oo.abstracao.SistemaDePagamento;

public abstract class FormaPagamento {

    public abstract void processarPagamento(double valor);
    public abstract boolean validarPagamento();
}

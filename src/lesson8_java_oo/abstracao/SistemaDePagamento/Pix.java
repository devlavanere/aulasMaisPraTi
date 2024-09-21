package lesson8_java_oo.abstracao.SistemaDePagamento;

public class Pix extends FormaPagamento{

    @Override
    public void processarPagamento(double valor) {

    }

    @Override
    public boolean validarPagamento() {
        return true;
    }
}

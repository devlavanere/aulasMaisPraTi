package lesson8_java_oo.encapsulamento.ClasseValidacao;

public class DescontoInvalidoException extends Exception{
    public DescontoInvalidoException(String mensagem) {
        super(mensagem);
    }
}

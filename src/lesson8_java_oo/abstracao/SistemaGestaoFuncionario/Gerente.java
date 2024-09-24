package lesson8_java_oo.abstracao.SistemaGestaoFuncionario;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 1.5;
    }

    @Override
    public double calcularBonus() {
        return calcularSalario() * 0.1; // Bônus de 10%
    }
}

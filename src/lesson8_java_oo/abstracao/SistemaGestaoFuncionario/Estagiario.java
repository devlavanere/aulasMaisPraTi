package lesson8_java_oo.abstracao.SistemaGestaoFuncionario;

public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() * 0.8; // 80% do salário base
    }

    @Override
    public double calcularBonus() {
        return 0; // Não tem bõnus
    }
}

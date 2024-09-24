package lesson8_java_oo.abstracao.SistemaGestaoFuncionario;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }

    @Override
    public double calcularBonus() {
        return calcularSalario() * 0.05; //Bônus de 5% do salário
    }
}

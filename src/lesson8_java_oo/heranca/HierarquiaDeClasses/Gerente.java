package lesson8_java_oo.heranca.HierarquiaDeClasses;

public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.20;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario= R$" + salario +
                ", bonus= R$" + calcularBonus() +
                '}';
    }
}

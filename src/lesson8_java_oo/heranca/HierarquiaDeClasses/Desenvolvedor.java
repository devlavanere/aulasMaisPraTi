package lesson8_java_oo.heranca.HierarquiaDeClasses;

public class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.10;
    }

    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario= R$" + salario +
                ", bonus= R$" + calcularBonus() +
                '}';
    }
}

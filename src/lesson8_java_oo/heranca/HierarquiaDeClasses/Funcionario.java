package lesson8_java_oo.heranca.HierarquiaDeClasses;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        setSalario(salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("Salario deve ser positivo.");
        }
    }

    public double calcularBonus() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario= R$" + salario +
                '}';
    }
}

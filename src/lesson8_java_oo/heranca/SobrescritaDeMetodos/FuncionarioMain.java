package lesson8_java_oo.heranca.SobrescritaDeMetodos;

public class FuncionarioMain {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.trabalhar(); // Saída: O funcionário está trabalhando.

        Funcionario gerente = new Gerente();
        gerente.trabalhar(); // Saída: O gerente está gerenciando a equipe.

        Funcionario desenvolvedor = new Desenvolvedor();
        desenvolvedor.trabalhar(); // Saída: O desenvolvedor está escrevendo código.
    }
}

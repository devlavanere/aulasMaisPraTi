package lesson8_java_oo.abstracao.SistemaGestaoFuncionario;

public class FuncionarioMain {
    public static void main(String[] args) {
        try {
            GestaoFuncionarios gestao = new GestaoFuncionarios();

            gestao.adicionarFuncionario(new Gerente("Lucas", 7000));
            gestao.adicionarFuncionario(new Desenvolvedor("Marilia", 5000));
            gestao.adicionarFuncionario(new Estagiario("Pedro", 2000));

            gestao.calcularFolhaDePagamento();

            // Promover o estagiário
            gestao.promoverFuncionario(2); // Promover Pedro

            // Recalcular a folha de pagamento
            gestao.calcularFolhaDePagamento();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

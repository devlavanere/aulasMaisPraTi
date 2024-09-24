package lesson8_java_oo.abstracao.SistemaGestaoFuncionario;

import java.util.ArrayList;
import java.util.List;

public class GestaoFuncionarios {
    private List<Funcionario> funcionarios;

    public GestaoFuncionarios() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void calcularFolhaDePagamento() {
        double totalSalários = 0;
        double totalBonus = 0;

        for(Funcionario f : funcionarios) {
            totalSalários += f.calcularSalario();
            totalBonus += f.calcularBonus();
        }

        System.out.println("Total de Salários: " + totalSalários);
        System.out.println("Total de Bônus: " + totalBonus);
    }

    public void promoverFuncionario(int indice) throws Exception{
        if(indice < 0 || indice >= funcionarios.size()) {
            throw new Exception("Funcionário não encontrado.");
        }

        Funcionario f = funcionarios.get(indice);
        if(f instanceof Estagiario) {
            funcionarios.set(indice, new Desenvolvedor(f.getNome(), f.getSalarioBase()));
            System.out.println(f.getNome() + "promovido a Desenvolvedor.");
        } else if(f instanceof Desenvolvedor) {
            funcionarios.set(indice, new Gerente(f.getNome(), f.getSalarioBase()));
            System.out.println(f.getNome() + "promovido a Gerente.");
        } else {
            System.out.println(f.getNome() + "já é Gerente e não pode ser promovido.");
        }
    }
}

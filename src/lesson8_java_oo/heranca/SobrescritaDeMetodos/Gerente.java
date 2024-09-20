package lesson8_java_oo.heranca.SobrescritaDeMetodos;

public class Gerente extends Funcionario{

    @Override
    //Essa anotação ajuda o compilador a verificar se o método está realmente sobrescrevendo um método da superclasse
    public void trabalhar() {
        System.out.println("O gerente está gerenciando a equipe.");;
    }
}

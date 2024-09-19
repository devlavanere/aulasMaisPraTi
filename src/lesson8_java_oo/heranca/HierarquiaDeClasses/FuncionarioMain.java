package lesson8_java_oo.heranca.HierarquiaDeClasses;

public class FuncionarioMain {
    public static void main(String[] args) {
        try {
            // Criando gerente e calculando bônus
            Funcionario gerente = new Gerente("Jaques", 6500.00);
            System.out.println(gerente);
            System.out.println("Bônus Gerente: R$" + gerente.calcularBonus());

            System.out.println("---------------------------------------------------------------");

            // Criando desenvolvedor e calculando bônus
            Funcionario desenvolvedor = new Desenvolvedor("Michel", 3500.00);
            System.out.println(desenvolvedor);
            System.out.println("Bônus Desenvolvedor: R$" + desenvolvedor.calcularBonus());

            System.out.println("---------------------------------------------------------------");

            // Coferindo para certificar que o sálario negativo não vai passar
            Funcionario desenvolvedor2 = new Desenvolvedor("André", -50.00);
            System.out.println(desenvolvedor2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

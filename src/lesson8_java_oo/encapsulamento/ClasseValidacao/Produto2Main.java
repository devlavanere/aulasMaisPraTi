package lesson8_java_oo.encapsulamento.ClasseValidacao;

public class Produto2Main {
    public static void main(String[] args) {
        try {
            Produto2 produto2 = new Produto2("Camisa", 25.50, 5);

            // Exibir informações do produto
            System.out.println(produto2);

            // Aplicar desconto de 10%
            produto2.aplicarDesconto(10);
            System.out.println("Preço após desconto: " + produto2.getPreco());

            // Tratando excessão com a Classe DescontoInvalidoException
            produto2.aplicarDesconto(60);
            System.out.println(produto2.getPreco());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

package lesson8_java_oo.encapsulamento.ClasseSimples;

public class ProdutoMain {
    public static void main(String[] args) {
        Produto produto = new Produto("Camisa", 35.25, 10);

        // Acessar atributos
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());

        // Modificando os atributos
        produto.setPreco(-3); // Tenta definir um preço negativo
        produto.setQuantidadeEstoque(15); // Atualiza a quantidade em estoque
        produto.setPreco(30.20); // Atualiza preço

        System.out.println("Preco atualizado: " + produto.getPreco());
        System.out.println("Quantidade em estoque atualizada: " + produto.getQuantidadeEstoque());
    }

}

package lesson8_java_oo.encapsulamento.ClasseValidacao;

public class Produto2 {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto2(String nome, double preco, int quantidadeEstoque) throws Exception {
        this.nome = nome;
        setPreco(preco);
        setQuantidadeEstoque(quantidadeEstoque);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws IllegalArgumentException{
        if(preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Preco não pode ser negativo.");
        }
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) throws IllegalArgumentException{
        if(quantidadeEstoque >= 0) {
            this.quantidadeEstoque = quantidadeEstoque;
        } else {
            throw new IllegalArgumentException("Quantidade em estoque não pode ser negativa.");
        }
    }

    public double aplicarDesconto(double porcentagem) throws DescontoInvalidoException {
        if (porcentagem < 0 || porcentagem > 50) {
            throw new DescontoInvalidoException("Desconto não pode ser maior que 50% ou negativo.");
        }
        double desconto = preco * (porcentagem / 100);
        return this.preco -= desconto;
    }

    @Override
    public String toString() {
        return "Produto2{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}
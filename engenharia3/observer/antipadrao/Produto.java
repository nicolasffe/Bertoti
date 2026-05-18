package antipadrao;

public class Produto {
    private final String nome;
    private double preco;

    private final Usuario usuario1;
    private final Usuario usuario2;

    public Produto(String nome, double preco, Usuario u1, Usuario u2) {
        this.nome = nome;
        this.preco = preco;
        this.usuario1 = u1;
        this.usuario2 = u2;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;

        usuario1.atualizar(nome, preco);
        usuario2.atualizar(nome, preco);
    }
}

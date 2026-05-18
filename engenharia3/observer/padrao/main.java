package padrao;

public class main {
    public static void main(String[] args) {

        Produto produto = new Produto("Notebook", 3000);

        Usuario u1 = new Usuario("João");
        Usuario u2 = new Usuario("Maria");

        produto.adicionarObserver(u1);
        produto.adicionarObserver(u2);

        produto.setPreco(2500);
    }
}
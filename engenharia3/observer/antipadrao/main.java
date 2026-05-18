package antipadrao;

public class main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("João");
        Usuario u2 = new Usuario("Maria");

        Produto produto = new Produto("Notebook", 3000, u1, u2);

        produto.setPreco(2500);
    }
}
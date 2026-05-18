package antipadrao;

public class Usuario {
    private final String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void atualizar(String produto, double preco) {
        String mensagem = nome + " foi notificado: "
                + produto + " agora custa R$" + preco;

        System.out.println(mensagem);
    }
}

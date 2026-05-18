package padrao;

public class Usuario implements Observer {
    private final String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeProduto, double preco) {
        String mensagem = nome + " foi notificado: "
                + nomeProduto + " agora custa R$" + preco;

        System.out.println(mensagem);
    }
}

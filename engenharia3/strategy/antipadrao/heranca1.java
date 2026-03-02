//o problema desse tipo de codigo(heranca) e a repeticao de codigo
class Cliente {
    String nome;
    double saldo;
    boolean emprestimo;

    public Cliente(String nome, double saldo, boolean emprestimo){
        this.nome = nome;
        this.saldo = saldo;  
        this.emprestimo = emprestimo;
        }
}

class ClienteComum extends Cliente {
    public ClienteComum(String nome, double saldo, boolean emprestimo){
        super(nome, saldo, false)   }
}

class Estudante extends Cliente {
    public Estudante(String nome, double saldo, boolean emprestimo){
        super(nome, saldo, false)   }
}

class Empresa extends Cliente {
    public Empresa(String nome, double saldo, boolean emprestimo){
        super(nome, saldo, true)   }
}

class Aposentado extends Cliente {
    public Aposentado(String nome, double saldo, boolean emprestimo){
        super(nome, saldo, true)   }
}
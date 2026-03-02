// o problema desse tipo de codigo(heranca) e a repeticao de codigo
class Cliente {
    String nome;
    double saldo;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }
}

//subclasses sem emprestimo
class ClienteComum extends Cliente {
    public ClienteComum(String nome, double saldo) {
        super(nome, saldo);
    }
}

class Estudante extends Cliente {
    public Estudante(String nome, double saldo) {
        super(nome, saldo);
    }
}

//subclasses com emprestimo

class Empresa extends Cliente {
    public Empresa(String nome, double saldo) {
        super(nome, saldo);
    }

    public void solicitarEmprestimo (double valor) {
        this.saldo += valor;
    }
}

class Aposentado extends Cliente {
    public Aposentado(String nome, double saldo) {
        super(nome, saldo);
    }

    public void solicitarEmprestimo (double valor) {
        this.saldo += valor;
    }
}
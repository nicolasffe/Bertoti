// Classe abstrata: Define o "contrato"
abstract class Cliente {
    protected String nome;
    protected double saldo;

    public Cliente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // Método abstrato: OBRIGA cada tipo de cliente a ter sua própria regra de limite
    public abstract double calcularLimiteEmprestimo();
}

// O Estudante tem um limite baixo e fixo, independente do saldo
class Estudante extends Cliente {
    public Estudante(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public double calcularLimiteEmprestimo() {
        return 500.00; // Limite cravado em 500 reais
    }
}

// A Empresa tem um limite agressivo: 5 vezes o valor que ela tem de saldo
class Empresa extends Cliente {
    public Empresa(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public double calcularLimiteEmprestimo() {
        return this.saldo * 5.0; 
    }
}

// O Aposentado tem um limite base garantido + o dobro do seu saldo
class Aposentado extends Cliente {
    public Aposentado(String nome, double saldo) {
        super(nome, saldo);
    }

    @Override
    public double calcularLimiteEmprestimo() {
        return 2000.00 + (this.saldo * 2.0); 
    }
}
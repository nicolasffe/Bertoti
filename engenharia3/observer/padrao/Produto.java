package padrao;

import java.util.ArrayList;
import java.util.List;

public class Produto implements Subject {
    private final String nome;
    private double preco;
    private final List<Observer> observers = new ArrayList<>();

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        notificarObservers();
    }

    @Override
    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers() {
        for (Observer observer : observers) {
            observer.atualizar(nome, preco);
        }
    }
}

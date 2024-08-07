package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    // Attributes
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade); // Ordena a lista utilizando o método compareTo da classe Pessoa
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        // testes:
        // Adiciona pessoas à lista
        ordenacaoPessoa.adicionarPessoa("Ana", 30, 1.65);
        ordenacaoPessoa.adicionarPessoa("Bruno", 25, 1.80);
        ordenacaoPessoa.adicionarPessoa("Carla", 28, 1.70);
        ordenacaoPessoa.adicionarPessoa("Daniel", 22, 1.75);
        ordenacaoPessoa.adicionarPessoa("Eva", 35, 1.60);

        // Ordena e exibe a lista de pessoas por idade
        List<Pessoa> pessoasOrdenadasPorIdade = ordenacaoPessoa.ordenarPorIdade();
        System.out.println("Lista de pessoas ordenadas por idade:");
        for (Pessoa p : pessoasOrdenadasPorIdade) {
            System.out.println(p);
        }

        // Ordena e exibe a lista de pessoas por altura
        List<Pessoa> pessoasOrdenadasPorAltura = ordenacaoPessoa.ordenarPorAltura();
        System.out.println("\nLista de pessoas ordenadas por altura:");
        for (Pessoa p : pessoasOrdenadasPorAltura) {
            System.out.println(p);
        }
    }
}

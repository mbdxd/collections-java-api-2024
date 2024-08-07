package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // Attribute
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criação do catálogo de livros
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        // Adicionando livros ao catálogo
        catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
        catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
        catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
        catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

        // Pesquisando livros por autor
        System.out.println("Livros de Robert C. Martin:");
        System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));

        System.out.println("Livros de Autor Inexistente:");
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor Inexistente"));

        // Pesquisando livros por intervalo de anos
        System.out.println("Livros entre 2010 e 2022:");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2010, 2022));

        System.out.println("Livros entre 2025 e 2030:");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2025, 2030));

        // Pesquisando livros por título
        System.out.println("Livro com título 'Java Guia do Programador':");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Java Guia do Programador"));

        System.out.println("Livro com título 'Título Inexistente':");
        System.out.println(catalogoLivros.pesquisarPorTitulo("Título Inexistente"));
    }
}

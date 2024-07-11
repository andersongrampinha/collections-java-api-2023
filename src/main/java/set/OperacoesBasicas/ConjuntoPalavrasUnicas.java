package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    //atributos
    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicasSet.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicasSet.isEmpty()) {
            if (palavrasUnicasSet.contains(palavra)) {
                palavrasUnicasSet.remove(palavra);
            } else {
                System.out.println("A Palavra '"+palavra+"' não foi encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ConjuntoPalavrasUnicas
        ConjuntoPalavrasUnicas conjuntoFrutas = new ConjuntoPalavrasUnicas();

        // Adicionando Frutas ao conjunto
        conjuntoFrutas.adicionarPalavra("Maça");
        conjuntoFrutas.adicionarPalavra("Pera");
        conjuntoFrutas.adicionarPalavra("Banana");
        conjuntoFrutas.adicionarPalavra("Uva");

        // Exibindo as frutas únicas no conjunto
        conjuntoFrutas.exibirPalavrasUnicas();

        // Removendo uma Frutas do conjunto
        conjuntoFrutas.removerPalavra("Banana");
        conjuntoFrutas.exibirPalavrasUnicas();

        // Removendo uma Frutas inexistente
        conjuntoFrutas.removerPalavra("Uva");

        conjuntoFrutas.removerPalavra("Melancia");

        // Verificando se uma Frutas está no conjunto
        System.out.println("A fruta 'Uva' está no conjunto? " + conjuntoFrutas.verificarPalavra("Uva"));
        System.out.println("A fruta 'Pera' está no conjunto? " + conjuntoFrutas.verificarPalavra("Pera"));

        // Exibindo as Frutass únicas atualizadas no conjunto
        conjuntoFrutas.exibirPalavrasUnicas();
    }
}

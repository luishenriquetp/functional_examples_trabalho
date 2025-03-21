package br.com.trabalho.word;

import java.util.*;
import java.util.stream.Collectors;

public class WordPractice {

    private static final String[] WORDS = {"Arroz", "Feijão", "Ovo", "Frito", "Radar", "Osso"};

    public List<String> wordsLessThan5Characters() {
        // Filtra apenas palavras que possuem menos de 5 caracteres
        return Arrays.stream(WORDS)
                .filter(word -> word.length() < 5)
                .collect(Collectors.toList());
    }

    public List<String> words5Characters() {
        // Filtra apenas palavras que possuem exatamente 5 caracteres
        return Arrays.stream(WORDS)
                .filter(word -> word.length() == 5)
                .collect(Collectors.toList());
    }

    public List<String> wordsGreaterThan5Characters() {
        // Filtra apenas palavras que possuem mais de 5 caracteres
        return Arrays.stream(WORDS)
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());
    }

    public List<String> wordsArePalindromes() {
        // Identifica e retorna palavras que são palíndromos
        return Arrays.stream(WORDS)
                .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
                .collect(Collectors.toList());
    }

    public Map<String, Integer> countLetterEachWord() {
        // Retorna um mapa contendo cada palavra e sua contagem de caracteres
        return Arrays.stream(WORDS)
                .collect(Collectors.toMap(word -> word, String::length));
    }

    public Integer countLettersAllWordHave() {
        // Soma o número total de caracteres de todas as palavras
        return Arrays.stream(WORDS)
                .mapToInt(String::length)
                .sum();
    }

    public static void main(String[] args) {
        WordPractice wp = new WordPractice();

        System.out.println("Palavras com menos de 5 caracteres: " + wp.wordsLessThan5Characters());
        System.out.println("Palavras com exatamente 5 caracteres: " + wp.words5Characters());
        System.out.println("Palavras com mais de 5 caracteres: " + wp.wordsGreaterThan5Characters());
        System.out.println("Palavras que são palíndromos: " + wp.wordsArePalindromes());
        System.out.println("Contagem de caracteres por palavra: " + wp.countLetterEachWord());
        System.out.println("Total de caracteres em todas as palavras: " + wp.countLettersAllWordHave());
    }
}

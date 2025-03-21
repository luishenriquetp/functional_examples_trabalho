package br.com.trabalho.number;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberPractice {

    private static final Integer[] NUMBERS = {4, 1, 1, 8, 1, 7, 3, 2, 3, 4};

    public List<Integer> numbersLessThan5() {
        // Filtra todos os números que são menores que 5
        return Arrays.stream(NUMBERS)
                .filter(n -> n < 5)
                .collect(Collectors.toList());
    }

    public Set<Integer> removeRepeatNumbers() {
        // Remove os números repetidos
        return Arrays.stream(NUMBERS)
                .collect(Collectors.toSet());
    }

    public Integer sumAllNumbers() {
        // Calcula a soma total dos números
        return Arrays.stream(NUMBERS)
                .mapToInt(Integer::intValue)
                .sum();
    }

    public Integer sumNumbersWithoutRepeats() {
        // Soma todos os números sem contar os repetidos
        return Arrays.stream(NUMBERS)
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public Map<Integer, Long> countRepeatedNumber() {
        // Conta quantas vezes cada número aparece na lista
        return Arrays.stream(NUMBERS)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void main(String[] args) {
        NumberPractice np = new NumberPractice();

        System.out.println("Números menores que 5: " + np.numbersLessThan5());
        System.out.println("Sem números repetidos: " + np.removeRepeatNumbers());
        System.out.println("Soma total dos números: " + np.sumAllNumbers());
        System.out.println("Soma sem números repetidos: " + np.sumNumbersWithoutRepeats());
        System.out.println("Contagem de números repetidos: " + np.countRepeatedNumber());
    }
}

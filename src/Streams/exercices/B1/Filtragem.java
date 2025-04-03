package Streams.exercices.B1;

import java.util.Arrays;
import java.util.List;

/**
 * Dada uma lista de números inteiros, use Stream para:
 * Filtrar apenas os números pares
 * Filtrar números maiores que 10
 */
public class Filtragem {


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 13, 14, 15);

        // Filtrar números pares
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println("Números pares: " + pares);

        // Filtrar números maiores que 10
        List<Integer> maioresQue10 = numeros.stream()
                .filter(n -> n > 10)
                .toList();
        System.out.println("Números > 10: " + maioresQue10);


    }
}


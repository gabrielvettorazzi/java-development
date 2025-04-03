package Streams.exercices.B1;

import java.util.Arrays;
import java.util.List;

/**
 * Dada uma lista de strings:
 * Converta todas para letras maiúsculas
 * Obtenha o comprimento de cada string
 */
public class Mapeamento {
    public static void main(String[] args) {
        List<String> user = Arrays.asList("gabriel","luis","carlos");

        //Lista que vai guardar os valores convertidos
        List<String> userUP = user.stream()
                .map(u -> u.toUpperCase())
                .toList();
                 System.out.println(userUP);

                List<String> userlOWER = user.stream()
                        .map(i -> i.toLowerCase())
                        .toList();
                        System.out.println(userlOWER);

    }

}

package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
         List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
         /*
             1. Numero para string binaria...
             2. Inverter a string
             3.Converter de volta para inteiro
          */

        System.out.println("Numero para string binaria");
        nums.stream().map(num -> Integer.toBinaryString(num)).forEach(print);


        System.out.println("invertendo String e alterando para arrya");
        nums.stream().map(inv -> new StringBuilder(inv).reverse().toString())
                .toArray(String[]::new );
    }
}

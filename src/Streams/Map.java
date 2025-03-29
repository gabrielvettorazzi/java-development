package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::println;
        //o map vai iterar e fazer o que foi pedido
        List<String> marcas = Arrays.asList("audi","honda", "bmw");
             marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("usando composisão");
        marcas.stream()
                .map(maiuscula)
                .map(primeiraLetra)
                .map(grito)
                .forEach(print);
    }


}

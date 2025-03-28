package Streams;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimidoObjetos {
    public static void main(String[] args) {
    List<String> Aprovado = Arrays.asList("lu", "Lucas", "julia");
        System.out.println("\nUsando o for each: ");
        for (String i: Aprovado) {
            System.out.println(i);
        }

        System.out.println("\nUsando o interator");
        //verifica se tem algum indice, se tiver passa para o proximo
        Iterator<String> it = Aprovado.iterator();
         while (it.hasNext()) {
             System.out.println(it.next());
         }

        System.out.println("\nUsando o Stream");
           //cria uma Stream a partir da lista
        Stream<String> stream = Aprovado.stream();
         //percorre cada elemento da stream, imprime o valor
         stream.forEach(System.out::println);

    }
}

package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,8,7,9,8,76,67);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

         int total = nums.stream()
                  .reduce(soma)
                  .get(); // na funcao de baixo não precisei do get pois passei um valor inicial

             System.out.println(total);

                int total2 = nums.parallelStream().reduce(100, soma);
        System.out.println(total2);
    }
}

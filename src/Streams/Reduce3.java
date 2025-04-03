package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana",6.0);
        Aluno a2 = new Aluno("Julia",8.0);
        Aluno a3 = new Aluno("Weverton",7.0);
        Aluno a4 = new Aluno("Douglas",3.0);
        Aluno a5 = new Aluno("Tais",9.0);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        Function<Aluno, Double> apenasnota = a -> a.nota;
        BinaryOperator<Double> somatorio = (a, b) -> a + b;


        alunos.stream()
                .filter(aprovado)
                .map(apenasnota)
                .reduce(somatorio)
                .ifPresent(System.out::println);
    }
}

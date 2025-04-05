package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        //cria objetos
        Aluno a1 = new Aluno("Ana",6.0);
        Aluno a2 = new Aluno("Julia",8.0);
        Aluno a3 = new Aluno("Weverton",7.0);
        Aluno a4 = new Aluno("Douglas",3.0);
        Aluno a5 = new Aluno("Tais",9.0);

        //criar uma lista com Aluno
        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        //predicate define se é true ou false
        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado)); // verifica se todos são true(Predicate)
        System.out.println(alunos.stream().anyMatch(aprovado));  // verifica de pelo menos 1 é true(Predicate)
        System.out.println(alunos.stream().noneMatch(aprovado));  // tanto faz
    }
}

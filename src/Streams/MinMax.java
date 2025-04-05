package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class MinMax {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana",6.0);
        Aluno a2 = new Aluno("Julia",8.0);
        Aluno a3 = new Aluno("Weverton",7.0);
        Aluno a4 = new Aluno("Douglas",3.0);
        Aluno a5 = new Aluno("Tais",9.0);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if(a1.nota > a2.nota) return 1;
            if(a1.nota < a2.nota) return -1;
            return 0;
        };

        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}

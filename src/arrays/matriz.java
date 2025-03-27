package arrays;


import java.util.Arrays;
import java.util.Scanner;

/*
* matriz que pega o qnt de alunos e quantas notas cada aluno tirou e faz a media
*
* */
public class matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos alunos tem na turma? ");
        int qtdAlunos = scanner.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdNota = scanner.nextInt();

        double [][]  notasDaTurma = new double[qtdAlunos][qtdNota];

        double total = 0;
        for (int a = 0; a <notasDaTurma.length ; a++) {
            for (int n = 0; n <notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota do aluno %d: ", n,a);
                notasDaTurma[a][n] =scanner.nextDouble();
            }
        }
         double media = total /(qtdAlunos * qtdNota);
        System.out.println("A média do aluno é: " + media);

        for (double[] notasDoAluno: notasDaTurma){
            System.out.println(Arrays.toString(notasDoAluno));
        }
        scanner.close();
    }
}

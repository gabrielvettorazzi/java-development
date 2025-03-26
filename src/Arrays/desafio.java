package Arrays;

import java.util.Scanner;
/*
//calcular a media de notas, o usuario vai giitar a quantida de denotas
// e seguindo essa ordens ele vai pedir nota a nota evai ser dentro de um loops
//retornar media
*/
public class desafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas notas?");
        int qntNotas = scanner.nextInt();

        double[] notas = new double[qntNotas];

        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Informe a nota " +(i + 1 )+": ");
            notas[i] = scanner.nextInt();
        }

        double total = 0 ;
        for (double nota: notas) {
            total += nota;
        }



        System.out.println("A media é: " + ( total / notas.length) );
        scanner.close();
    }
}

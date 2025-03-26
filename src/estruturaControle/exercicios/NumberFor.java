package estruturaControle.exercicios;

import java.util.Scanner;

public class NumberFor {
    public static void main(String[] args) {
        //Criar um programa que receba um número e diga se ele é um número primo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("INforme o numero para descobrir se ele é primo..");
        int num =scanner.nextInt();

          if (num > 1 && num % 1 == 0) {
              System.out.println("Não é um numero primo!!");
          }else
              System.out.println("Não é primo   ");
        scanner.close();
    }
}

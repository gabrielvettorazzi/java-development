package estruturaControle.exercicios;

import java.util.Scanner;

public class numberone {
    public static void main(String[] args) {
        //1. Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par;
        Scanner scanner = new Scanner(System.in);

        System.out.println  ("Informe um numero entre 0 e 10: ");
        int numero = scanner.nextInt();

          if (numero >= 0 && numero <= 10) {
              if (numero % 2 == 0) {
              System.out.println(" O numero "+numero+ " é um numero par");
              } else {
                  System.out.println("Este numero é impar");
              }
          } else {
              System.out.println("Informe um numero entre ZERO e DEZ");
          }

          scanner.close();
    }
}

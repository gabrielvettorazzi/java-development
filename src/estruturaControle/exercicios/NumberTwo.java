package estruturaControle.exercicios;

import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) {
        //Criar um programa informa se o ano atual é um ano bissexto;
        //um ano bissexo é dividsivel por quatro
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos verificar se o ano é bissexto? informe um ano");
            int ano = scanner.nextInt();

            if (ano % 4 == 0 && ano % 100 != 0 ){
                System.out.println("O ano "+ano+" é um ano bissexto");
            } else {
                System.out.println(" O ano não é bissextoooo");
            }

        scanner.close();
    }
}

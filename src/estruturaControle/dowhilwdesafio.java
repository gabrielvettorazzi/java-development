package estruturaControle;

import java.util.Scanner;

public class dowhilwdesafio {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
               int qntnotas = 0;
            double notas = 0;
         double total = 0;


     while (notas != -1 ){
         System.out.println("Informe a nota(ou -1 p/sair): ");
         notas = entrada.nextDouble();

         if (notas <=10 && notas >=0) {
               total+=notas;
               qntnotas++;
         }else if (notas != -1 ){
             System.out.println("Nota invalida");
         }
     }
             //calcular a media
              double media = total / qntnotas;
            System.out.println("Média =" + media);
          entrada.close();
    }
}

package estruturaControle;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String conceito = "";
        System.out.println("Infirme a nota.." );
        int nota = entrada.nextInt();

        switch (nota) {
            case 10: case 9:
            conceito = "A";
            break;

            case 8: case 7:
                conceito = "B";
                break;

            case 6: case 5:
                conceito = "C";
                break;

            case 4: case 3:
                conceito ="D";
               break ;

        }
        System.out.println("desculpa incentivar voces");
    }
}


import java.util.Scanner;

public class dowhillw {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String texto = "";

             do {
                 System.out.println("Por favor, diga as palavras magicas..");
                 System.out.println("Quer sair? ");
                 texto = teclado.nextLine();
             } while (!texto.equalsIgnoreCase("por favor"));
                

             System.out.println("Obrigado!");
             teclado.close();
        }




        

}

package Arrays;

public class foreach {
    public static void main(String[] args) {
        double[] notas = {9.9, 8.9, 6.7 ,2.3};
        for (int i = 0; i <notas.length ; i++) {
              System.out.println(notas[i]);
        }

        //for each
        for(double nota: notas) {
            System.out.println(nota);
        }
    }
}

package Arrays;

import java.util.Arrays;

public class exer {
    public static void main(String[] args) {
        double[] notasAlunos = new double[4];
        System.out.println(Arrays.toString(notasAlunos));

        notasAlunos[0] = 2.4;
        notasAlunos[1] = 9.67;
        notasAlunos[2] = 10.00;
        notasAlunos[3] = 8.56;

        System.out.println(Arrays.toString(notasAlunos));

        double total= 0;
        for (int i =0; i<3; i++ ) {
            total += notasAlunos[i];
        }
    }

}

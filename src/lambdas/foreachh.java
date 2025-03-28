package lambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class foreachh {

    public static void main(String[] args) {
        ArrayList<Integer> valores= new ArrayList<Integer>();
        ArrayList<Integer> par = new ArrayList<Integer>();
        ArrayList<Integer> impar = new ArrayList<Integer>();

         valores.add(23);
         valores.add(3);
         valores.add(4);
         valores.add(5);
         valores.add(6);

         valores.forEach((v)-> {par.add(v * 2);});

        System.out.println(valores);
        System.out.println(par);
        System.out.println(impar);

        //(PARAMETRO) -> {EXPRESSAO}

    }
}

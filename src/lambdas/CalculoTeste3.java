package lambdas;

import java.util.Date;
import java.util.function.BinaryOperator;

public class CalculoTeste3 {

    public static void main(String[] args) {

         BinaryOperator<Double> calc = (a, b) -> { return a + b; };
        System.out.println(calc.apply(3.0,5.0));

        calc = (a,b) -> a *b;
        System.out.println(calc.apply(34.0,56.0));










    }
}

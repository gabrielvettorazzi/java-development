package lambdas;

public class CalculoTeste2 {

    public static void main(String[] args) {

        //arrow function
        Calculo soma = (a, b) -> {
               return a+b;
        };
             System.out.println(" o resultado da soma é : " + soma.executar(2,67));


        Calculo mul = (a,b) -> {
              return a * b;
        };
        System.out.println("o resultado a multiplicação é: " + mul.executar(23,54));


        //mul = (a,b) -> x * y;
    }
}

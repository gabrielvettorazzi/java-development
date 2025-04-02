package Streams;

import java.util.Arrays;
import java.util.List;

public class FilterDesafio {
    public static void main(String[] args) {
        //crie duas Listas para urtilizar oo filter

        Carro C1 = new Carro("CAMARO", 233);
        Carro C2 = new Carro("ferrari", 280);
        Carro C3 = new Carro("AUDI", 190);
        Carro C4 = new Carro("FIAT UNO", 460);

        List<Carro> caros = Arrays.asList(C1,C2,C3,C4);
          caros.stream()
                  .filter(c -> c.velocidade >= 280)
                  .map(c -> "O carro mais rapido do mundo é: " + c.nome +"!!")
                  .forEach(System.out::println);

    }
}

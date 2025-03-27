package lambdas;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        List<String> aprovaodos = Arrays.asList("Ana", "mateus", "Joao", "julia");

        //froma tracdicional
        for(String nome : aprovaodos){
            System.out.println(aprovaodos);
        }

        
        System.out.println("\ncom lambda..");
        aprovaodos.forEach(nome  -> System.out.println(nome + "!!!"));

        System.out.println("\nMethodo reference");
        aprovaodos.forEach(System.out::println);

    }
}

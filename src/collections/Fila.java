package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        //offer e add -> Adicionam elementos na fila
        //diferença é o comportamento quando a fila está cheia
        fila.add("gabriel v");
        fila.add("Ana");
        fila.offer("Bia");  //retorna false se se a fila estiver cheia
        fila.offer("gabi");


        System.out.println(fila.peek()); //retorna o elemento do inicio da fila
        System.out.println(fila.peek());
        System.out.println(fila.element());


        // Adicionando elementos
        fila.add("Primeiro");
        fila.offer("Segundo");

        // Verificando o primeiro elemento
        System.out.println("Primeiro elemento: " + fila.peek());

        // Removendo elementos
        String removido1 = fila.remove();
        String removido2 = fila.poll();

        System.out.println("Elementos removidos: " + removido1 + ", " + removido2);
    }
}

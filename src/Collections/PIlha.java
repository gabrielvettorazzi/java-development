package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

//LIFO
/*
push() – Insere um elemento na pilha
pop() – Remove um elemento da pilha
empty() – Verifica se a pilha está vazi
* */
public class PIlha {

    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();

        livros.add("O pequeno princepe");
        livros.push("bela e a fera");
        livros.push( "o hobbit");


        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());


    }

}

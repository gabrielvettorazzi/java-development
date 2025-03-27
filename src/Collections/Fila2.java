package Collections;

import java.util.LinkedList;
import java.util.Queue;

//fifo
public class Fila2 {

    public static void main(String[] args) {

        Queue<String> carro = new LinkedList<>();
             carro.add("Golf");
             carro.add("fiat");
             carro.add("Nissan");
             carro.add ("Ford");
             carro.add ("Honda");

        System.out.println("Obtendo o topo da fila:  "+carro.peek());
        System.out.println("Topo da fila: " + carro.poll()); //mostrar e retirar o topo

        System.out.println(carro);
        System.out.println(carro.isEmpty()?"Fila vazia":"Fila com elementos");
    }
}

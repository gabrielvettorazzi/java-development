package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    //estrutura chave valor
    public static void main(String[] args) {

         Map <Integer, String> usuarios = new HashMap<>();
       // Insere um par chave-valor no mapa
         usuarios.put(1, "Roberto");
         usuarios.put(2, "ana");
        usuarios.put(3, "Jorge");
        usuarios.put(4, "pedro");
        usuarios.put(5, "Vini");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty()); //Verifica se o mapa está vazio

        System.out.println(usuarios.keySet()); //Retorna um Set com todas as chaves do mapa
        System.out.println(usuarios.values()); //Retorna uma Collection com todos os valores do mapa

        System.out.println(usuarios.containsKey(3)); //Retorna uma Collection com todos os valores do mapa
        System.out.println(usuarios.containsValue("ana"));

        System.out.println(usuarios.size()); //vberifica tamanho

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);

        }

    }
}

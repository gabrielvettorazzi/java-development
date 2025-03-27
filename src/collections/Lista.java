package collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<User> Lista = new ArrayList<>();
        User u1 = new User("Ana"); //construtor
        Lista.add(u1);
        Lista.add(new User("maria"));
        Lista.add(new User("teo"));
        Lista.add(new User("leo"));
        Lista.add(new User("jonas"));
        Lista.add(new User("pedro"));

        System.out.println(Lista.get(4));
         for(User u: Lista) {
             System.out.println(u.nome);
         }
    //posso remover pelo indice e pelo objto
        Lista.remove(2);
         Lista.remove("pedro");


    }
}

package Collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {
        HashSet<User> usuario = new HashSet<User>();

           usuario.add(new User("carol"));
           usuario.add(new User("carla"));
           usuario.add(new User("erick"));
           usuario.add(new User("luis"));

           boolean resultado = usuario.contains(new User("Guilherme"));
           System.out.println(resultado);
    }
}

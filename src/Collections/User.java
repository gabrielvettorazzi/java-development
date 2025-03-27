package Collections;

import java.util.Objects;

public class User {
    String nome;

     User(String nome){       //objeto
         this.nome = nome;
     }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(nome, user.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }
}

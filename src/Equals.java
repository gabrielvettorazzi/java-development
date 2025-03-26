//EQUALS -> retorna true or false (BOOLEAN)
  //HASHCODE -> INT separe elementos que não são iguasi. e retorna objetos eupodem ser iguais +performance
public class Equals {

    public static void main(String[] args) {
            Usuario u1 = new Usuario();
            u1.nome ="pedro correa";
            u1.email ="pedrocorrea@zmail.com";

            Usuario u2 = new Usuario();
            u2.nome = "Emily";
            u2.email = "emilycosta@gmail.com";

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));
        System.out.println(u2.equals(u1));


    }
}

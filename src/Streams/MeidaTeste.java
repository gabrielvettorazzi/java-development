package Streams;

public class MeidaTeste {
    public static void main(String[] args) {

        Media m1 = new Media().add(2.4).add(7.8);
        Media m2 = new Media().add(7.8).add(5.6);

            System.out.println(m1.getVal());
            System.out.println(m2.getVal());

            System.out.println(Media.combinar(m1, m2).getVal());

    }
}

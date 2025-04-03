package Streams;

public class Media {
   private double total;
   private int quandidade;


   public Media add(double valor) {
          total += valor;
          quandidade ++;
          return this;
   }


   public double getVal() {
        return total / quandidade;
   }

   public static Media combinar(Media m1, Media m2) {
       Media resultante = new Media();
       resultante.total = m1.total + m2.total;
       resultante.quandidade = m1.quandidade + m2.quandidade;
       return resultante;
   }

}

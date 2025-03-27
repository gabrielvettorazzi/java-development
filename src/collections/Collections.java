package collections;

import java.util.HashSet;

public class Collections {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet(); // não aceita repetição
        conjunto.add(1.3); // double -> Double
        conjunto.add(true);
        conjunto.add("String");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println("O tamanho é: "+ conjunto.size());
        System.out.println(conjunto.remove('x'));
        System.out.println(conjunto.contains("String"));

        HashSet nunms = new HashSet();
        nunms.add(1);
        nunms.add(2);
        nunms.add(3);
        nunms.add(4);
        nunms.add(5);
        System.out.println(nunms);
        System.out.println(conjunto);

        conjunto.addAll(nunms); // união entro w conjuntos
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

    }
}

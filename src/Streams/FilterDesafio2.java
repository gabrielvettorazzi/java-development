package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio2 {
    public static void main(String[] args) {
        //todos os produtos com desconto maior que 30% && frete gratis
        // fazer um .MAP colocando o preco,nome, "super promoção

        Produto p1 = new Produto("Lapis", 1.99, 0.35,0);
        Produto p2 = new Produto("Notebook", 4889, 0.12,0);
        Produto p3 = new Produto("Caderno", 30, 0.12,0);
        Produto p4 = new Produto("Impressora", 999, 0.4,30);
        Produto p5 = new Produto("Ipad", 3100, 0.29,30);
        Produto p6 = new Produto("Relogio", 1900, 0.12,0);
        Produto p7 = new Produto("Monitor", 800, 0.31,0);

        List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
        // Filtrer, filter, map
        Predicate<Produto> superPromocao = p -> p.desconto >=30;
        Predicate<Produto> freteGratis = p -> p.valorfrete == 0;
        Predicate<Produto> produtoRelevante = p -> p.valorfrete >= 500;

        Function<Produto, String> chamadaPromocinal =
                p  -> "Aproveite!" +p.nome+ "por" +p.preco;

                produtos.stream()
                .filter(superPromocao)
                .filter(freteGratis)
                .filter(produtoRelevante)
                .map(chamadaPromocinal)
                        .forEach(System.out::println);
    }
}

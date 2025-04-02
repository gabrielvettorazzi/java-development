package Streams;

public class Produto {
    String nome;
    double preco;
    double desconto;
    double valorfrete;


    public Produto(String nome, double preco, double desconto, double valorfrete) {
        this.nome = nome;
        this.valorfrete = valorfrete;
        this.desconto = desconto;
        this.preco = preco;
    }


}

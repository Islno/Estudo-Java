package Classe;

public class Aula01Produto {
    String nome;
    double preco;
    double desconto;

    void precoComDesconto(String nome, double preco, double desconto) {
        double precoComDesconto = preco - (preco * desconto);
        System.out.println("O preço do(a) " + nome + " com desconto é de: " + precoComDesconto);
    }

}

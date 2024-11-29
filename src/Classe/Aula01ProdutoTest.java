package Classe;

public class Aula01ProdutoTest {
    public static void main(String[] args) {
        Aula01Produto p1 = new Aula01Produto();
        p1.nome = "Teclado";
        p1.preco = 100.00;
        p1.desconto = 0.15;

        var p2 = new Aula01Produto();
        p2.nome = "Mouse";
        p2.preco = 70.00;
        p2.desconto = 0.08;

        System.out.println(p1.nome);
        System.out.println(p1.preco);
        System.out.println(p1.desconto);
        System.out.println("______________________");
        System.out.println(p2.nome);
        System.out.println(p2.preco);
        System.out.println(p2.desconto);
        System.out.println("______________________________");
        p1.precoComDesconto(p1.nome, p1.preco, p1.desconto);
        System.out.println("______________________________");
        p2.precoComDesconto(p2.nome, p2.preco, p2.desconto);
    }
}

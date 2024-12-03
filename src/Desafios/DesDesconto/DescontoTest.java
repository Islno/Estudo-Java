package Desafios.DesDesconto;

public class DescontoTest {
    public static void main(String[] args) {

        Desconto p1 = new Desconto("Notebook", 2235.50);

        Desconto p2 = p1; // p2 é uma referência para o mesmo objeto que p1
        /*?
        se eu mudar o valor de p2, o valor de p1 também muda
        ao contrario de uma variavel primitiva
        que não muda o valor de outra variavel
         */
        System.out.println("Nome: " + p1.nome);
        System.out.println("Preço: " + p1.preco);
        System.out.println("Preço com desconto: " + p1.precoComDesconto());
        System.out.println("______________________");
        System.out.println("Nome: " + p2.nome);
        System.out.println("Preço: " + p2.preco);
        System.out.println("Preço com desconto: " + p2.precoComDesconto());
    }
}

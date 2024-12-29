package Oo;

public class CompraTest {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "João Pedro";
        c1.adicionarItem("Caneta", 20, 7.45);
        c1.adicionarItem("Borracha", 12, 3.89);

        System.out.println(c1.valorTotal());
    }
}

package Oo.Desafio;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João Pedro");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 20, 20);
        c1.compras.add(compra1);

        System.out.println(c1.ValorTotalCompras());

    }
}

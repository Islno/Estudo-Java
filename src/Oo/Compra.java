package Oo;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Item item){
        itens.add(item);
        item.compra = this;
    }

    void adicionarItem(String nome, int quantidade, double preco){
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    double valorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.quantidade * item.preco;
        }
        return total;
    }


}

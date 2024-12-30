package Oo.Desafio;

import java.util.ArrayList;

public class Cliente {
    String nome;
   final ArrayList<Compra> compras = new ArrayList<>();

   Cliente(String nome){
       this.nome = nome;
   }

   double ValorTotalCompras(){
       double total = 0;
       for(Compra compra: compras){
           total += compra.valorTotal();
       }
       return total;
   }
}

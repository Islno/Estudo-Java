package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();

        pilha.add("O Pequeno Príncipe");
        pilha.push("Dom Quixote");
        pilha.push("O Hobbit");
        pilha.push("Código Limpo");
        pilha.push("O Livro de Java");

        System.out.println(pilha.peek());//imprimi o ultimo elemento da pilha, se a pilha estiver vazia, retorna null
        System.out.println(pilha.element());//imprimi o ultimo elemento da pilha, se a pilha estiver vazia, retorna um erro

        System.out.println(pilha.poll());//le e remove o ultimo elemento
        System.out.println(pilha.poll());//le e remove o ultimo elemento

        System.out.println(pilha.pop());//le e remove o ultimo elemento, se a pilha estiver vazia, retorna um erro
        System.out.println(pilha.pop());//le e remove o ultimo elemento, se a pilha estiver vazia, retorna um erro

        pilha.clear();//limpa a pilha
        pilha.size();//retorna o tamanho da pilha
        pilha.contains("O Hobbit");//verifica se a pilha contém o elemento
    }
}

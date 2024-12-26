package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        fila.add("Ana"); //Se o tamanho for excedido, retorna um erro
        fila.offer("Carlos"); //Se o tamanho for excedido, retorna false


        System.out.println(fila.peek()); //lê o primeiro elemento da fila, e se a fila estiver vazia, retorna null
        System.out.println(fila.element()); //lê o primeiro elemento da fila, e se a fila estiver vazia, retorna um erro

        System.out.println(fila.isEmpty()); //verifica se a fila está vazia

        //fila.remove(); //lê o primeiro elemento da fila e remove, se usado em uma fila vazia, retorna um erro

        System.out.println(fila.poll()); //lê o primeiro elemento da fila e remove, se usado em uma fila vazia, retorna null
        System.out.println(fila.poll()); //lê o primeiro elemento da fila e remove, se usado em uma fila vazia, retorna null
        System.out.println(fila.poll()); //lê o primeiro elemento da fila e remove, se usado em uma fila vazia, retorna null

        //fila.clear(); //limpa a fila
        //fila.size(); //retorna o tamanho da fila
        //fila.contains("Ana"); //verifica se a fila contém o elemento
    }

}

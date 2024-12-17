package Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntosComSortedSet {
    public static void main(String[] args) {
        SortedSet<String> listaAprovados = new TreeSet<>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        /*/ NÃO CONSIGO MAIS ADICIONAR TIPOS DIFERENTES, POIS O SORTEDSET NÃO DEIXA

        Set listaAprovados2 = new HashSet();
        listaAprovados2.add(12);
        listaAprovados.addAll(listaAprovados2);

         */

        System.out.println(listaAprovados);

    }
}

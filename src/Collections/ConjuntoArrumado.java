package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoArrumado {
    public static void main(String[] args) {
        // Quando eu adiciono <> ao lado do Set
        // eu estou dizendo que o Set é de um tipo específico
        // é necessário colocar somente de um lado
        Set<String> lista = new HashSet<String>();

        lista.add("Ana");
        lista.add("Carlos");

        Set lista2 = new HashSet();
        lista2.add(12);

        //ISSO É UM PROBLEMA
        // POIS EU POSSO ADICIONAR QUALQUER TIPO DE DADO
        // MESMO QUE EU TENHA DEFINIDO QUE O SET É DE UM TIPO ESPECÍFICO
        lista.addAll(lista2);
        System.out.println(lista);

        Set<String> listaAprovados = new HashSet<String>();
        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for (String candidato : listaAprovados) {
            System.out.println(candidato);
        }
    }
}

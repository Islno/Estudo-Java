package Collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        lista.add(new Usuario("Ana"));
        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));

        for (Usuario u : lista) {
            System.out.println(u.nome);
        }
        System.out.println("___________________");
        System.out.println(lista.get(2).nome);
    }
}

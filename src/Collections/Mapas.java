package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();

        /*?
        O put serve tanto para adicionar, quanto para alterar
        se sobrepor o ID já usado.
         */
        usuarios.put(1, "Islanio");
        usuarios.put(1, "Ana"); //Alterando o valor String do ID 1.
        usuarios.put(2, "Carlos");
        usuarios.put(3, "Luca");
        for (String key : usuarios.values()) {
            System.out.println(key);
        }
        for (Map.Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey() + " " + registro.getValue());
        }

        System.out.println(usuarios.size()); //Retorna o tamanho do Map.
        System.out.println(usuarios.get(1)); //Retorna o valor do ID 1.
        System.out.println(usuarios.keySet()); //Retorna os IDs.
        System.out.println(usuarios.values()); //Retorna os valores.
        System.out.println(usuarios.entrySet()); //Retorna os IDs e os valores.
        System.out.println(usuarios.remove(1)); //Remove o valor do ID 1
        System.out.println(usuarios.containsKey(1)); //Verifica se o ID 1 existe.
        System.out.println(usuarios.containsValue("Ana")); //Verifica se o valor "Ana" existe.
        System.out.println(usuarios.isEmpty()); //Verifica se o Map está vazio.
    }
}

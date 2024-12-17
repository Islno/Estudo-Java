package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        // HashSet não aceita tipos primitivos
        // Então os valores abaixo são convertidos para objetos
        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); // int -> Integer
        conjunto.add('x'); // char -> Character

        // Não aceita repetição
        // Então ele ignora a implementação de valores rep
        // O tamanho do conjunto é 5, mesmo que tenha 7 valores
        conjunto.add('x');
        conjunto.add("Teste");

        // Removendo um valor do conjunto duplicado
        // Mesmo tendo 2 valores, ele interpreta e remove só 1
        conjunto.remove("Teste");

        System.out.println(conjunto.size());
        System.out.println("Conjunto: " + conjunto);

        //Verifica se o conjunto contém o valor
        System.out.println(conjunto.contains("Teste"));

        // Define uma variavel tipo Set, em uma variavel tipo HashSet
        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("Nums: " + nums);

        //unir os conjuntos
        conjunto.addAll(nums);
        System.out.println("Conjunto unido: " + conjunto);

        // Interseção
        conjunto.retainAll(nums);
        System.out.println("Conjunto interseção: " + conjunto);

        //Esvaziar o conjunto
        conjunto.clear();
        System.out.println("Conjunto vazio: " + conjunto);
    }
}

package Desafios;

public class Des10Trauma {
    int a = 3;
    static int b = 3;
    /*/
    o b pode ser acessado sem instanciar a classe
    porque ele é static, ou seja, ele é um atributo
    static pode ser acessado por static
     */

    public static void main(String[] args) {
        Des10Trauma a1 = new Des10Trauma();
        System.out.println(a1.a);
        System.out.println(b);
    }
}

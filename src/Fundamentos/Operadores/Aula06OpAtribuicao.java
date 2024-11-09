package Fundamentos.Operadores;

public class Aula06OpAtribuicao {
    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        // tem formas de simplificar operações
        c = c +b;
        // é igual a:
        c += b;
        // isso se chama atribuição (aditiva) de valor a variavel

        // Outros exemplos:
        c -= b;
        c /= b;
        c *= b;

        // Operador unário, mas de atribuição
        c++;
        c--;

        c %= 2; // Verifica o resto do numero (bom pra saber se
        // é impar ou par)
    }
}

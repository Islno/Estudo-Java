package Fundamentos.Operadores;

public class Aula07OpUnarios {
    public static void main(String[] args) {


        int a = 1;
        int b = 2;

        //Exemplos de Operadores Unarios (POS-FIXADA)
        a++; // a = a + 1;
        a--; // a = a - 1;

        // Exemplos de Operadores Unarios (PRE-FIXADA)
        ++b; // b = b + 1;
        --b; // b = b - 1;

        /*/
        repara que a operação ++A == B--;
        OCORRE POR ETAPAS, ENTAO SE A (A = 1 E B = 2)
        PRIMEIRO ELE INCREMENTA 1 EM A, DEPOIS COMPARA COM B
        FICANDO (A = 2 E B = 2)
        PARA DEPOIS DECREMENTAR 1 DE B
         */

    }
}

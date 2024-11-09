package Desafios;

public class Des03If {
    public static void main(String[] args) {

        double nota = 1.3;
//  O codigo a baixo tem a sintaxe errada, pois os ";"
//  estão fechando o bloco de codigo IF, pois pra ele imprimir
//  a mensagem corretamente, não deve haver o ";"
        if (nota >= 9.0);{
            System.out.println("Você é bom");
        }
//  Codigo correto
        if (nota >= 9.0){
            System.out.println("Você é bom");
        }
    }
}

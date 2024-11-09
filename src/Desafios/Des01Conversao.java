package Desafios;

import java.util.Scanner;

public class Des01Conversao {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        System.out.println("Informe seu primeiro salario: ");
        String valor1 = salario.nextLine().replace(",",".");
        System.out.println("Informe seu segundo salario: ");
        String valor2 = salario.nextLine().replace(",",".");
        System.out.println("Informe seu terceiro salario: ");
        String valor3 = salario.nextLine().replace(",",".");
        salario.close();

        float salario1 = Float.parseFloat(valor1);
        float salario2 = Float.parseFloat(valor2);
        float salario3 = Float.parseFloat(valor3);

        float mediasalario = (salario1 + salario2 + salario3)/3;
        System.out.println("Media salarial: " + mediasalario);
    }
}

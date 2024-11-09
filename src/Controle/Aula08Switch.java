package Controle;

import java.util.Locale;

public class Aula08Switch {
    public static void main(String[] args) {
        String faixa = "preta";
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai");
            case "marrom":
                System.out.println("Sei o Tekkei Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "laranja":
                System.out.println("Sei o Hiwfoinew");
            case "vermelha":
                System.out.println("fn0wjnewpnfnp");
            case "amarela":
                System.out.println("pweifnewifn");
            default:
                System.out.println("Não sei");
        }
    }
}

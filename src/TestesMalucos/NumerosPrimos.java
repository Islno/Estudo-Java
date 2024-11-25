package TestesMalucos;

public class NumerosPrimos {
    public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            boolean isPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                System.out.println(i);
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }
            if (isPrimo) {
                System.out.println("O numero " + num + " é primo");
            }
        }
    }
}
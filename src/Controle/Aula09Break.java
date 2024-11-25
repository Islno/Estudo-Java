package Controle;

public class Aula09Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i==5){
                System.out.println("chegou a 5");
                break;
            }
            System.out.println("i= "+ i);
        }
        System.out.println("Fim");
    }
}

package Oo;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.ligar();
        c1.acelerar();

        /*/ Faltou encapsulamento
        c1.motor.fatorInjecao = 2.5;
         */
        System.out.println(c1.motor.giros());
        System.out.println(c1.motor.fatorInjecao);
    }
}

package Desafios.Data;

public class DataTest {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = 7;
        d1.mes = 11;
        d1.ano = 2023;

        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
        System.out.println("_________________");
        d1.obterData(d1.dia, d1.mes, d1.ano);
    }
}

package Desafios.Data;

public class DataTest {
    public static void main(String[] args) {
        Data d1 = new Data();
        /*/
        a data padrão no construtor é 1/1/1970
        é possível mudar a data padrão
         */

        Data d2 = new Data(25, 12, 2022);

        System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
        System.out.println("_________________");
        d1.obterData(d1.dia, d1.mes, d1.ano);
    }
}

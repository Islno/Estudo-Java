package Desafios.Data;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    Data() {
        dia = 1;
        mes = 1;
        ano = 1970;

    }

    void obterData(int dia, int mes, int ano) {
        System.out.println("Data: " + dia + "/" + mes + "/" + ano);
    }
}

package Classe;

public class Aula02AreaCirc {
    double raio;
    static double PI = 3.14;

    Aula02AreaCirc(double raio) {
        this.raio = raio;
    }

    double area() {
        return Math.pow(raio, 2) * PI;
    }
}

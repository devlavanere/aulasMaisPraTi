package aulas;

public class Geometria {
    public double altura;
    public double largura;

    public Geometria(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double calcularAreaRetangulo() {
        return largura * altura;
    }

    public static double multiplicar(int a, int b){
        return a * b;
    }
}

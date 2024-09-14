import aulas.Geometria;
import aulas.ContaBancaria;
import util.Utilitarios;

public class Main {
    public static void main(String[] args) {
        Geometria geo = new Geometria(20,10);
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.depositar(100);
        System.out.println(contaBancaria.consultarSaldo());

//        double areaRetangulo = geo.calcularAreaRetangulo();
//        System.out.println(areaRetangulo);

        //Utilizando o método statico/não precisa instanciar
        System.out.println(Geometria.multiplicar(10, 10));

        Utilitarios.print("Olá Mundo");
    }
}
package lesson8_java_oo.polimorfismo.PolimorfismoInterface;

// Classe principal para testar as implementações
public class Main {
    public static void main(String[] args) {
        // Criando um array de IMeioTransporte
        IMeioTransporte[] transportes = new IMeioTransporte[3];
        transportes[0] = new Carro();
        transportes[1] = new Bicicleta();
        transportes[2] = new Trem();

        // Percorrendo o array e chamando os métodos
        for (IMeioTransporte transporte : transportes) {
            transporte.acelerar();
            transporte.frear();
        }
    }
}

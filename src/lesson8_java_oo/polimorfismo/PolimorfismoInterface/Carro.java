package lesson8_java_oo.polimorfismo.PolimorfismoInterface;

// Implementando a interface na classe Carro
class Carro implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}

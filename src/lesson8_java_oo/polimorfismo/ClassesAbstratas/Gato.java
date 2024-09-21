package lesson8_java_oo.polimorfismo.ClassesAbstratas;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O gato faz: Miau");
    }
}

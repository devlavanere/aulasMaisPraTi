package lesson8_java_oo.polimorfismo.ClassesAbstratas;

import java.util.ArrayList;
import java.util.List;

public class AnimalMain {
    public static void main(String[] args) {
        // Criando lista de animais
        List<Animal> animais = new ArrayList<>();

        // Adicionando instâncias das subclasses à lista
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Vaca());

        // Iterando sobre a lista e invocando o método emitirSom() para cada animal
        for(Animal animal : animais) {
            animal.emitirSom();
        }
    }
}

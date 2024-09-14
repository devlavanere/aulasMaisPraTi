package lists;

import java.util.Arrays;

public class CustomList {
    private int[] elements;
    private int size;

    public CustomList() {
        this.elements = new int[10];
        this.size = 0;
    }

    public void add(int element) {
        if(this.size == this.elements.length) {
            this.resize();
        }
        this.elements[this.size++] = element;
    }

    public int get(int index) {
        if(index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index fora dos limites inválido.");
        }
        return this.elements[index];
    }

    public void remove(int index){ // Método público para remover um elemento da lista pelo seu índice.
        if(index >= this.size || index < 0){ // Verifica se o índice está fora dos limites válidos da lista.
            throw new IndexOutOfBoundsException("Index fora dos limites/inválido"); // Se o índice for inválido, lança uma exceção.
        }
        for(int i = index; i < this.size - 1; i++){ // Move os elementos após o índice para a esquerda, sobrescrevendo o elemento removido.
            this.elements[i] = this.elements[i + 1]; // Copia o próximo elemento para a posição atual.
        }
        this.size--; // Decrementa o "size" para refletir a remoção de um elemento.
    }

    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(this.elements, 0, this.size));
    }

    public void resize() {
        int[] newElements = new int[this.elements.length * 2];

        for(int i = 0; i < this.elements.length; i++) {
            newElements[i] = this.elements[i];
        }
        this.elements = newElements;
    }
}

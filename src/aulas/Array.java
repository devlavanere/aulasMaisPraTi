package aulas;

public class Array {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};

        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for(int num : array) {
            System.out.println(num);
        }

        for(int i = array.length -1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}

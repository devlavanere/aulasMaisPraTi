package lists;

import java.util.ArrayList;

public class CustomListMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(89);
        list.add(90);
        list.add(92);

        System.out.println("Indice de numero 0: " + list.get(0));
        System.out.println(list.remove(1));
        System.out.println(list.get(1));
        System.out.println(list.size());
    }
}

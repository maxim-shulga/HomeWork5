package task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            listOfNumbers.add(i);
        }
        System.out.println(listOfNumbers);

        ListIterator<Integer> list = listOfNumbers.listIterator();
        while (list.hasNext()){
            list.set(list.next() + 1);
        }

        System.out.println(listOfNumbers);
    }
}

package additional;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Петренко");
        teachers.add("Сидоренко");
        teachers.add("Небийвода");
        teachers.add("Даниленко");
        teachers.add("Покотило");

        int indexOfBest = teachers.indexOf("Сидоренко");
        System.out.println("Index of the best teacher is " + indexOfBest);

        int indexOfWorst = teachers.indexOf("Покотило");
        System.out.println("Index of the worst teacher is " + indexOfWorst);

    }
}

package task2;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> animals;
    public Zoo(String[] listOfAnimals){

        animals = new ArrayList<>();

        for (int i = 0; i < listOfAnimals.length; i++) {
            animals.add(i, listOfAnimals[i]);
        }
    }
    public void showAnimals(){
        System.out.println(animals);
    }
}

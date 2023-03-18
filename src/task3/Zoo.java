package task3;

import java.util.ArrayList;

public class Zoo {
    ArrayList<String> animals;
    public Zoo(String[] listOfAnimals){

        animals = new ArrayList<>();

        for (int i = 0; i < listOfAnimals.length; i++) {
            animals.add(i, listOfAnimals[i]);
        }
    }
    public void deleteSomeAnimals(){
        animals.remove(7-1);
        animals.remove(5-1);
        animals.remove(3-1);
        System.out.println("size after deleting is " + animals.size());
    }
    public void showAnimals(){
        System.out.println(animals);
    }

}

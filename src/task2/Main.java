package task2;

public class Main {
    public static void main(String[] args) {
        String [] listOfAnimal = {"Dog", "Hippopotamus", "Zebra", "Tiger",
                "Wolf", "Fox", "Elephant", "Lion"};
        Zoo animals = new Zoo(listOfAnimal);
        animals.showAnimals();
    }
}

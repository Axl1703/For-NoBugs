package practice_5.homework.Zoo;

public class Zoo {


    public void addToZoo(Animal animal) {
        System.out.println(animal.getName() + " добавлен в Зоопарке");
    }

    public void makeAnimalSound(Animal animal) {
        animal.makeSound();
    }

    public void makeAnimalMove(Animal animal) {
        animal.move();
    }
}

package practice_5.homework.Zoo;

public class Main {
    public static void main(String[] args) {
        Animal elefant = new Elefant();
        Animal bird = new Bird();
        Zoo zoo = new Zoo();

        zoo.addToZoo(elefant);
        zoo.addToZoo(bird);
        zoo.makeAnimalMove(elefant);
        zoo.makeAnimalSound(bird);
        zoo.makeAnimalMove(elefant);
        zoo.makeAnimalMove(bird);
    }
}

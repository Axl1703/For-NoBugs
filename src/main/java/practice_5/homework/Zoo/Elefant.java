package practice_5.homework.Zoo;

public class Elefant extends Animal {


    public Elefant() {
        super.name = "Слон";
    }

    @Override
    public void makeSound() {
        System.out.println("Слон трубит");
    }

    @Override
    public void move() {
        System.out.println("Слон ходит");
    }
}

package practice_5.homework.Pet;

public class Dog extends Pet {

    final String name = "Собака";

    public String getName() {
        return name;
    }

    @Override
    public void care() {
        System.out.println(getName() + ": погулять");
    }

    @Override
    public void feed() {
        System.out.println(getName() + ": покормить сухим кормом");
    }
}

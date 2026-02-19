package practice_5.homework.Pet;

public class Cat extends Pet{
    final String name = "Кот";

    public String getName() {
        return name;
    }

    @Override
    public void care() {
        System.out.println(getName() + ": поиграть");
    }

    @Override
    public void feed() {
        System.out.println(getName() + ": покормить влажным кормом");
    }
}

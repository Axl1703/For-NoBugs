package practice_5.homework.Garden;

public class Orchid implements Plant{
    String name = "Орхидея";

    public String getName() {
        return name;
    }

    @Override
    public void care() {
        System.out.println(getName() + " требует высокую влажность и тень");
    }

    @Override
    public void addToGarden() {
        System.out.println(getName() + " добавлена в ботанический сад");
    }
}

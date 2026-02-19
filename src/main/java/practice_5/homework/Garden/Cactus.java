package practice_5.homework.Garden;

public class Cactus implements Plant{
    final String name = "Кактус";

    public String getName() {
        return name;
    }

    @Override
    public void care() {
        System.out.println(getName() + " требует много света, редкий полив");
    }

    @Override
    public void addToGarden() {
        System.out.println(getName() + " добавлен в ботанический сад");
    }
}

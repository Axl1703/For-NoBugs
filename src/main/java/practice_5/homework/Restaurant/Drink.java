package practice_5.homework.Restaurant;

public class Drink implements Dish{
    int volume;
    String name;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public Drink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public void description() {
        System.out.println(getName() + ":объем " + getVolume());
    }
}

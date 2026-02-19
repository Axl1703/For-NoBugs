package practice_5.homework.Restaurant;

public class HotDish implements Dish {

    int temperature;
    String name;

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

    public HotDish(String name, int temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public void description() {
        System.out.println(getName() + ":температура " + getTemperature());
    }
}

package practice_5.homework.Farm;

public class Chicken implements DomesticAnimal {
    String name = "Курица";

    public String getName() {
        return name;
    }

    @Override
    public void care() {
        System.out.println(getName() + ": требует зерно");
    }

    @Override
    public void function() {
        System.out.println(getName() + ": несёт яйца");
    }
}

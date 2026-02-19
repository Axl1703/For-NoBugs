package practice_5.homework.Farm;

public class Cow implements DomesticAnimal {
    String name = "Корова";

    public String getName() {
        return name;
    }

    @Override
    public void care() {
        System.out.println(getName() + ": нуждается в выпасе");
    }

    @Override
    public void function() {
        System.out.println(getName() + ": даёт молоко");
    }
}

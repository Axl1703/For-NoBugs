package practice_5.homework.Attractions;

public class Carousel extends Attraction{
    final String name = "Карусель";

    public String getName() {
        return name;
    }

    @Override
    public void controlType() {
        System.out.println(getName() + " требует технического обслуживания");
    }

    @Override
    public void info() {
        System.out.println(getName() + "с веселой музыкой");
    }
}

package practice_5.homework.Attractions;

public class RollerCoaster extends Attraction{
    final String name = "Американские горки";

    public String getName() {
        return name;
    }

    @Override
    public void controlType() {
        System.out.println(getName() + " требуют проверки безопасности");
    }

    @Override
    public void info() {
        System.out.println(getName() + " с высокой скоростью и адреналином");
    }
}

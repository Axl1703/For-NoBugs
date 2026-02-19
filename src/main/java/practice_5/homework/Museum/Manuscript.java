package practice_5.homework.Museum;

public class Manuscript implements Exhibit{
    final String name = "Манускрипт";

    public String getName() {
        return name;
    }

    @Override
    public void history() {
        System.out.println(getName() + " об истории Каира");
    }

    @Override
    public void storageCondition() {
        System.out.println(getName() + " требует контролируемой влажности");
    }
}

package practice_5.homework.Museum;

public class Sculpture implements Exhibit{
    final String name = "Скульптура";

    public String getName() {
        return name;
    }

    @Override
    public void history() {
        System.out.println(getName() + " богини");
    }

    @Override
    public void storageCondition() {
        System.out.println(getName() + " нуждается в реставрации");
    }
}

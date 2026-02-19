package practice_5.homework.Aquarium;

public class StarFish extends Creature {
    public StarFish() {
        super.name = "Морская звезда";
    }

    @Override
    public void move() {
        System.out.println(" медленно ползает");
    }
}

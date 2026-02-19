package practice_5.homework.Aquarium;

public class Shark extends Creature{
    public Shark(){
        super.name = "Акула";
    }

    @Override
    public void move() {
        System.out.println(" плавает быстро и агрессивно");
    }
}

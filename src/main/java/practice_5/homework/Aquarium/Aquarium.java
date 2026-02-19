package practice_5.homework.Aquarium;

public class Aquarium {
    public void addToAquarium(Creature creature) {
        System.out.println(creature.getName() + " в аквариуме");
    }

    public void showMove(Creature creature) {
        System.out.print(creature.getName());
        creature.move();
    }
}

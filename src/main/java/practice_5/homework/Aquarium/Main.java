package practice_5.homework.Aquarium;

public class Main {
    public static void main(String[] args) {
        Shark shark1 = new Shark();
        StarFish starFish1 = new StarFish();

        Aquarium aquarium = new Aquarium();

        aquarium.addToAquarium(shark1);
        aquarium.addToAquarium(starFish1);

        aquarium.showMove(shark1);
        aquarium.showMove(starFish1);
    }
}

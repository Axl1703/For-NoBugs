package practice_5.homework.Garden;

public class Main {
    public static void main(String[] args) {
        Cactus cactus1 = new Cactus();
        Orchid orchid1 = new Orchid();

        BotanicGarden garden = new BotanicGarden();

        garden.addToGarden(cactus1);
        garden.carePlant(cactus1);

        garden.addToGarden(orchid1);
        garden.carePlant(orchid1);

    }
}

package practice_5.homework.Farm;

public class Main {
    public static void main(String[] args) {
        Chicken chicken1 = new Chicken();
        Cow goal1 = new Cow();

        Farm farm = new Farm();

        farm.controlDomesticAnimal(chicken1);

        farm.controlDomesticAnimal(goal1);
    }


}

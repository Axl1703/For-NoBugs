package practice_5.homework.Zoo;

public class Bird extends Animal {

    public Bird() {
        super.name = "Птица";
    }

    @Override
    public void makeSound() {
        System.out.println("Птица летает");
    }

    @Override
    public void move() {
        System.out.println("Птица чирикает");
    }
}

package practice_5.homework.Pet;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        ContactWithPet contactWithPet = new ContactWithPet();
        contactWithPet.carePet(cat1);
        contactWithPet.feedPet(cat1);

        contactWithPet.carePet(dog1);
        contactWithPet.feedPet(dog1);
    }
}

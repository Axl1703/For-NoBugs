package practice_8.homework.generics;

public class Main {
    public static void main() {
        Box<String> samsungPhone = new Box<>("Galaxy s26");
        Box<String> samsungTv = new Box<>("Tv oled 1000");

        System.out.println(samsungPhone.getElement());
        System.out.println(samsungTv.getElement());

        Box<Integer> phoneNumber1 = new Box<>(12345678);
        Box<Integer> phoneNumber2 = new Box<>(12345578);

        System.out.println(phoneNumber1.getElement());
        System.out.println(phoneNumber2.getElement());

        String[] names = new String[]{"Alex", "Nick", "Maria"};

        ArrayGeneric example = new ArrayGeneric();
        example.printArray(names);

        Pair<String, Integer> address1 = new Pair<>("SPB", 192000);
        Pair<String, Integer> address2 = new Pair<>("Moscow", 123457);
        Pair<String, Integer> address3 = new Pair<>("Sochi", 199000);

        System.out.println(address1.getFirst());
        System.out.println(address2.getFirst());

        address2.setFirst("Samara");

        System.out.println(address2.getFirst());
    }
}

package practice_2;

public class Main {
    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes-Benz", 2026);

        mercedes.setYear(2025);
//        mercedes.print();

        Rectangle rectangle1 = new Rectangle(5, 10);

        rectangle1.setWidth(6);

//        System.out.println(rectangle1.calculateArea());

        Book book1 = new Book("12 стульев", "Илья Ильф");

        book1.setAuthor("Евгений Петров");

//        book1.printInfo();

        BankAccount account1 = new BankAccount("ФИО", 1000);

        account1.deposit(1000);
        account1.withdraw(500);
//        account1.printBalance();

        Point firstPoint = new Point(2, 4);

        firstPoint.setX(3);
//        firstPoint.print();

        StudentGroup group1 = new StudentGroup("Первый курс", 20);
        group1.setStudentCount(25);

        Circle circle1 = new Circle(2.2);
        circle1.setRadius(3.3);
//        System.out.println("Площадь " + circle1.calculateArea());
//        System.out.println("Длина " + circle1.calculateCircumference());

        Teacher teacher = new Teacher("ФИО", "Физика");
        teacher.setSubject("Экономика");
//

        Product product1 = new Product("Ноутбук", 99999.99);

        product1.setPrice(89999.99);
        product1.applyDiscount(999.99);
//        product1.printInfo();

        Laptop laptop1 = new Laptop("ASUS", 99999.99);
        laptop1.setPrice(88888.88);
        laptop1.printInfo();

    }
}

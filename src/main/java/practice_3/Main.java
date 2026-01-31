package practice_3;

public class Main {
    public static void main(String[] args) {
        System.out.println(Student.studentCount);
        Student petya = new Student(18, "Petya");
        System.out.println(Student.studentCount);
        Student kolya = new Student(20, "Kolya");
        System.out.println(Student.studentCount);


        System.out.println(petya.age);
        System.out.println(kolya.age);
        System.out.println(Student.MAX_YEARS);
        Student.printMaxYears();


        Company worker1 = new Company(1, "Alex");
        Company worker2 = new Company(2, "John");
        Company worker3 = new Company(3, "James");

        worker1.printData();

        Company.companyName = "PEPSI";

        worker1.printData();
        worker2.printData();
        worker3.printData();

        Company.printCompanyName();

        System.out.println(MathConstants.calculateCircleArea(3.2));
        System.out.println(MathConstants.calculateCircumference(4.2));

        University student1 = new University(1, "Dima");
        University student2 = new University(2, "Misha");
        University student3 = new University(3, "Pasha");

        student1.printStudentInfo();

        University.changeUniversityName("MGU");

        student2.printStudentInfo();
        student1.printStudentInfo();
        student3.printStudentInfo();

        GameSettings game1 = new GameSettings("Футбол", 10);
        GameSettings game2 = new GameSettings("Хоккей", 5);

        GameSettings.setMaxPlayers();

        game1.addPlayer(1);

        game1.printGameStatus();
        game2.printGameStatus();

        Person person1 = new Person("Иван", "Иванов", "123-454-6789");
        Person person2 = new Person("Алексей", "Иванов", "987-54-3251");
        Person person3 = new Person("Мария", "Иванова", "235-56-2352");

        person2.printPersonInfo();

        person2.setFirstName("Павел");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
    }
}

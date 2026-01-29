package practice_2;

public class Student {
    int age;
    String Name;

    Student(int someAge, String someName) {
        this.age = someAge;
        this.Name = someName;
    }

    int getAge() {
        return this.age;
    }

    String getName() {
        return this.Name;
    }

    void setAge(int newAge) {
        this.age = newAge;
    }

    void setName(String newName) {
        this.Name = newName;
    }

    void print(){
        System.out.println("Возраст " + this.age + ", имя " + this.Name);
    }
}

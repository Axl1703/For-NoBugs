package practice_2;

public class Car {
    String brand;
    int year;

    Car(String someBrand, int someYear){
        this.brand = someBrand;
        this.year = someYear;
    }

    String getBrand(){
        return this.brand;
    }

    int getYear(){
        return this.year;
    }

    void setBrand(String newBrand){
        this.brand = newBrand;
    }

    void setYear(int newYear){
        this.year = newYear;
    }

    void print(){
        System.out.println("Марка " + this.brand + ", год выпуска " + this.year);
    }




//    Создайте класс
//    Car с
//    полями brand(строка) и year (
//    целое число).
//    Реализуйте конструктор
//    с двумя
//    параметрами,
//    геттеры и
//    сеттеры для
//    обоих полей, метод
//
//    print(),выводящий информацию о марке и годе выпуска.
//    В main
//    создайте объект, установите
//    значения через
//    конструктор,
//    измените год
//    через сеттер, выведите
//    информацию .
}

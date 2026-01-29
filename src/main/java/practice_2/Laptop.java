package practice_2;

public class Laptop {
    String brand;
    double price;

    public Laptop(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void printInfo(){
        System.out.println(this.brand + " " + this.price);
    }

    //    Создайте класс
//    Laptop с
//    полями brand
//    и price.
//    Реализуйте конструктор, геттеры
//    и сеттеры, и
//
//    метод printInfo(),выводящий информацию о ноутбуке и его цене.
//    В main
//    измените цену
//    и выведите
//    информацию .
}

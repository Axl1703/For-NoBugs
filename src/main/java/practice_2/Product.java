package practice_2;

public class Product {
    String name;
    double price;

    Product(String someName, double somePrice){
        this.name = someName;
        this.price = somePrice;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    double applyDiscount(double discount){
        this.price = getPrice() - discount;
        return this.price;
    }

    void printInfo(){
        System.out.println(this.name + " " + this.price);
    }

    //    Создайте класс
//    Product с
//    полями name
//    и price.
//    Реализуйте конструктор, геттеры, сеттер
//    для цены, метод
//
//    applyDiscount(discount) для применения скидки,и метод printInfo(),
//    выводящий информацию
//    о товаре
//    и цене.
//    В main
//    измените цену, примените
//    скидку и
//    выведите цену.
}

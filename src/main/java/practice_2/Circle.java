package practice_2;

import static java.lang.Math.PI;

public class Circle {

    double radius;

    Circle(double someRadius){
        this.radius = someRadius;
    }

    double getRadius(){
        return this.radius;
    }

    void setRadius(double newRadius){
        this.radius = newRadius;
    }

    public double calculateArea(){
        double area = PI * (getRadius() *  getRadius());
        return area;
    }

    public double calculateCircumference(){
        double circumference = 2 * PI * getRadius();
        return circumference;
    }


//    Создайте класс
//    Circle с
//    полем radius.
//    Реализуйте конструктор, геттер
//    и сеттер, методы
//
//    calculateArea() и calculateCircumference().
//    В main
//    измените радиус, выведите
//    площадь и
//    длину окружности.
}

package practice_2;

public class Point {

    int x;
    int y;

    Point(int someX, int someY){
        this.x = someX;
        this.y = someY;
    }

    int getX(){
        return this.x;
    }

    int getY(){
        return this.y;
    }

    void setX(int newX){
        this.x = newX;
    }

    void print(){
        System.out.println(this.x + " " + this.y);
    }

//    Создайте класс
//    Point с
//    координатами x
//    и y.
//    Реализуйте конструктор, геттеры, сеттер
//    только для
//    x,
//    и метод
//
//    print(),выводящий координаты.
//    В main
//    измените x, выведите
//    новые координаты.
}

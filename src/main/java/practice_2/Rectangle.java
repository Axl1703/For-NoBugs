package practice_2;

public class Rectangle {

    int width;
    int height;

    Rectangle(int someWidth, int someHeight){
        this.width = someWidth;
        this.height = someHeight;
    }

    int getWidth(){
        return this.width;
    }

    int getHeight(){
        return this.height;
    }

    void setWidth(int newWidth){
        this.width = newWidth;
    }

    public int calculateArea(){
        return width * height;
    }



//    Создайте класс
//    Rectangle с
//    полями width
//    и height.
//    Реализуйте конструктор, геттеры
//    для ширины
//    и высоты, сеттер
//    только для
//    ширины и
//
//    метод calculateArea() для расчёта площади.
//    В main
//    создайте прямоугольник, измените
//    ширину и
//    выведите площадь.

}

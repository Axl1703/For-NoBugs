package practice_5.homework.Restaurant;


import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<Dish> dishes = new ArrayList<>();

    public void description(Dish dish) {
        dish.description();
    }
}

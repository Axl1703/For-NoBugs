package practice_5.homework.Restaurant;

public class Main {

    public static void main(String[] args) {

        Drink drink1 = new Drink("Cola", 1);
        HotDish dish1 = new HotDish("Burger", 50);

        Menu menu = new Menu();

        menu.dishes.add(drink1);
        menu.dishes.add(dish1);

        menu.description(drink1);
        menu.description(dish1);
    }
}

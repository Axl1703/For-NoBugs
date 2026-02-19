package practice_5.homework.Attractions;

public class Main {

    public static void main(String[] args) {
        Carousel carousel1 = new Carousel();
        RollerCoaster rollerCoaster1 = new RollerCoaster();

        AttractionAmusement attractionAmusement = new AttractionAmusement();
        attractionAmusement.attractionControl(carousel1);
        attractionAmusement.attractionControl(rollerCoaster1);
    }
}

package practice_3;

public class LibraryTest {

    public static void main(String[] args) {


        Library book1 = new Library();

        book1.category = "Роман";
        book1.year = 1999;
        book1.getBookTitle();
        book1.setBookTitle("World");
        book1.author = "Mr. N";
    }
}

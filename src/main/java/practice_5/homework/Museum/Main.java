package practice_5.homework.Museum;

public class Main {
    public static void main(String[] args) {
        Manuscript manuscript1 = new Manuscript();
        Sculpture sculpture1 = new Sculpture();

        Museum museum = new Museum();

        museum.makeStorageCondition(manuscript1);
        museum.showHistory(manuscript1);

        museum.makeStorageCondition(sculpture1);
        museum.showHistory(sculpture1);
    }
}

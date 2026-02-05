package practice_3;

public class GameSettings {
    static int maxPlayers = 11;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void changeMaxPlayers() {
        maxPlayers++;
    }
    ;

    public int addPlayer(int players) {
        int newPlayersCount = this.currentPlayers + players;
        if (newPlayersCount <= maxPlayers) {
            this.currentPlayers = newPlayersCount;
        }
        return this.currentPlayers;
    }

    public void printGameStatus() {
        System.out.println("Название игры " + gameName + " Текущие игроки " + currentPlayers + " Максимальное кол-во игроков " + maxPlayers);
    }
}

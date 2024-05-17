package localhost.poker;

public class Player {
    private String id;
    private int balance;
    public Player(String playerId, int startingBalance) {
        id = playerId;
        balance = startingBalance;
    }
}

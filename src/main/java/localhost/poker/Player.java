package localhost.poker;

public class Player {
    private String id;
    private int balance;
    public Player(String userId, int startingBalance) {
        id = userId;
        balance = startingBalance;
    }
}

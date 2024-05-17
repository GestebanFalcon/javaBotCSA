package localhost.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Table {
    private int pot;
    private LinkedList<Player> players;
    private int startingBalance;
    private ArrayList<Card> deck;

    public Table(Player creator, int givenStartingBalance){
        startingBalance = givenStartingBalance;
        players = new LinkedList<Player>();
    }

    public int getStartingBalance(){
        return startingBalance;
    }

    public LinkedList<Player> getPlayers(){
        return players;
    }

    public void addPlayer(String userId, int playerStartingBalance) {
        Player newPlayer = new Player(userId, playerStartingBalance);
        players.add(newPlayer);

    }

    private void resetDeck() {
        //Create new empty deck
        deck = new ArrayList<Card>();

        //Populate the new deck with the default 52 cards
        populateDeckSuit("Hearts", deck);
        populateDeckSuit("Spades", deck);
        populateDeckSuit("Diamonds", deck);
        populateDeckSuit("Clubs", deck);
        // Shuffle the new deck
        Collections.shuffle(deck);
    }

    private void populateDeckSuit(String suit, ArrayList<Card> populatedDeck){
        populatedDeck.add(new Card("Ace", suit));
        for (int i = 2; i <= 10; i++) {
            populatedDeck.add(new Card(Integer.toString(i), suit));
        }
        populatedDeck.add(new Card("Jack", suit));
        populatedDeck.add(new Card("Queen", suit));
        populatedDeck.add(new Card("King", suit));
    }

    public void startGame(){

    }

}

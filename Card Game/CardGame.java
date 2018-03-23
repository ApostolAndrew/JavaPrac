import java.util.*;
class CardGame {
    
    /* generic CardGame class that card games can be built out of
    distribute cards function -> give x players cards until deck runs out
    add player function -> add player to player list
    players out -> display all player names */
    
    protected ArrayList<Player> players = new ArrayList<Player>();
    protected Deck gameDeck = new Deck();
    
    public CardGame () {
        gameDeck.deck_init();
    }
    
    /* Each player gets a card from the deck 
    player 1 gets card 1
    remove top card from the deck
    player 2 gets card 2
    remove top card from the deck
    ..
    player x gets card x
    player 1 gets card x + 1 */
    
    public void distributeDeck() {
        int numPlayers = players.size();
        for(int i = 0; gameDeck.size() > 0; i++) {
            players.get(i % numPlayers).addDeck(gameDeck.get(0)); 
            gameDeck.remove(0);
        }
        gameDeck.deck_out();
    }
    
    public void addPlayer(String name) { // add a player
        players.add(new Player(name));
    }
    
    public void rmPlayer(String name) { // remove a player
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).name_out() == name) {
                players.remove(i);
                return;
            }
        }
        System.out.println("Player " + name + " does not exist.");
        
    }
    
    public void playersOut() { // display all players
        for(int i = 0; i < players.size(); i++) {
            String counter = Integer.toString(i + 1);
            System.out.println("Player " + counter + " is " + players.get(i).name_out());
        }
    }
    
    public void playerHandOut(String p) { // display player p's hand
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).name_out() == p) {
                players.get(i).hand_out();
                return;
            }
        }
        System.out.println("Player " + p + " does not exist.");
    }
    
    public void playerDrawPDeck(String p) { // player p draws from their deck into their hand
        for(int i = 0; i < players.size(); i++) {
            if(players.get(i).name_out() == p) {
                players.get(i).draw_pDeck();
                return;
            }
        }
        System.out.println("Player " + p + " does not exist.");
    }
    
    public void playersDrawPDeck(int pos) { // player at pos draw 1 card from player deck
        players.get(pos).draw_pDeck();
    }
    
    public void shuffle() {
        gameDeck.shuffle();
    }
    
    
    public static void main(String[] args) {
        
        CardGame test = new CardGame();
        test.addPlayer("Andrew");
        test.addPlayer("Meredith");
        test.addPlayer("Alex");
        test.addPlayer("Karthik");
        test.addPlayer("Nikki");
        test.addPlayer("Ate");
        test.playersOut();
        test.rmPlayer("Andrew");
        test.playersOut();
        test.shuffle();
        test.distributeDeck();
        for(int i = 0; i < 9; i++) {
            test.playerDrawPDeck("Andrew");
            test.playerDrawPDeck("Ate");
            test.playerDrawPDeck("J");
        }
        //test.playerDrawPDeck("Andrew");
        test.playerHandOut("Andrew");
        test.playerHandOut("Meredith");
        test.playerHandOut("Alex");
        test.playerHandOut("Karthik");
        test.playerHandOut("Nikki");
        test.playerHandOut("A");
    }
}
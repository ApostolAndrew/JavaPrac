import java.util.*;
class Player {
        /*
        Players have a deck and a hand
        the hand is a small deck of cards
        Draw card function -> draw card from the input deck
        hand size function ->  return size of hand
        set name function -> set name of player
        add deck -> add card to player deck from main deck
        add hand -> add card to player hand from main deck
        */
        private Deck playerDeck = new Deck();
        private Deck playerHand = new Deck();
        private String name;
        
        public Player(String namae) {
            name = namae;
        }
        
        // draw number of cards from the game deck
        public void draw_card(Deck main_deck) { 
            Cards temp = new Cards();
            temp = main_deck.get(0);
            main_deck.remove(0);
            playerHand.add(temp);
            
        }
        // draw card from player deck
        public void draw_pDeck() {
            if(playerDeck.size() > 0) {
                Cards temp = new Cards();
                temp = playerDeck.get(0);
                playerDeck.remove(0);
                playerHand.add(temp);
            }
        }
        
        public void addDeck(Cards card) {
            playerDeck.add(card);
        }
        
        public void addHand(Cards card) {
            playerHand.add(card);
        }
        
        public void rmHand() {
            playerHand.remove(0);
        }
        
        public int hand_size() {
            return playerHand.size();
        }
        
        public void hand_out() {
            if(playerHand.size() > 0) {
                System.out.println(name + "'s hand is:");        
                playerHand.deck_out();
            }
            else {
                System.out.println(name + "'s hand is empty.");
            }
        }
        
        public String name_out() {
            return name;
        }
        
        public Deck Hand() {
            return playerHand;
        }
        
        public static void main(String[] args) {
        
        Player Andrew = new Player("Andrew");
        Deck main = new Deck();
        main.deck_init();
        main.shuffle();
        Andrew.draw_card(main);
        Andrew.draw_card(main);
        Andrew.hand_out();
        System.out.println("Hand size is " + Andrew.hand_size());
        System.out.println("Divide");
        System.out.println(Andrew.name_out());
    }
}
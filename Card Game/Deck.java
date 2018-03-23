import java.util.*;
import java.util.Random;
class Deck {
    
    private ArrayList<Cards> deck = new ArrayList<Cards>();
    
    public Deck() {
        
    }
    
    /* Initialize a deck with 52 cards
    13 of each suit from A to K
    suits are hearts, spades, diamonds, clubs
    number ranges from 2-9, J, Q, K, A */
    
    public void deck_init() { 
        
        for(int i = 0; i < 4; i++) {
            for(int j = 1; j < 14; j++) {
                Cards temp = new Cards();
                switch(j) { // give each card a value 
                case 1:
                    temp.set_number("A");
                    break;
                case 10:
                    temp.set_number("10");
                    break;
                case 11:
                    temp.set_number("J");
                    break;
                case 12:
                    temp.set_number("Q");
                    break;
                case 13: 
                    temp.set_number("K");
                    break;
                default:
                    temp.set_number(Integer.toString(j));
                    break;
                }
                
                switch(i) { // give each card a suit
                    case 0:
                        temp.set_suit("Clubs");
                        break;
                    case 1:
                        temp.set_suit("Hearts");
                        break;
                    case 2:
                        temp.set_suit("Diamonds");
                        break;
                    case 3:
                        temp.set_suit("Spades");
                        break;
                }
                deck.add(temp);
            }
        }
    }
    
    public void deck_out() { // output the deck
        for(Cards card : deck) {
            card.cards_out();
        }
    }
    
    public void shuffle() { // shuffle the entire deck
        Random gen = new Random();
        for(int i = deck.size() - 1; i > 0; i--) {
            int random = gen.nextInt(52);
            Collections.swap(deck, i, random);
        }
    }
    
    public Cards get(int pos) { // mirror ArrayList get function
        return deck.get(pos);
    }
    
    public void add(Cards card) { // mirror ArrayList add function
        deck.add(card);
    }
    
    public void remove(int pos) { // mirror ArrayList rm function
        deck.remove(pos);
    }
    
    public int size() { // mirror ArrayList size function
        return deck.size();
    }
    
    public static void main(String[] args) {
        
        Deck test = new Deck();
        test.deck_init();
        test.deck_out();
        test.shuffle();
        test.deck_out();
    }
}
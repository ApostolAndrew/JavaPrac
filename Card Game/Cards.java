class Cards {

    private String card_number;
    private String card_suit;
    
    public Cards() {
        
    }
    
    public void set_number(String number) {
        card_number = number;
    }
    
    public void set_suit(String suit) {
        card_suit = suit;
    }
    
    // return value of the card
    public int card_number() {
        int temp = 0;
        switch(card_number) {
            case "1":
                temp = 1;
            break;
            case "2":
                temp = 2;
            break;
            case "3":
                temp = 3;
            break;
            case "4":
                temp = 4;
            break;
            case "5":
                temp = 5;
            break;
            case "6":
                temp = 6;
            break;
            case "7":
                temp = 7;
            break;
            case "8":
                temp = 8;
            break;
            case "9":
                temp = 9;
            break;
            case "10":
                temp = 10;
            break;
            case "J":
                temp = 11;
            break;
            case "Q":
                temp = 12;
            break;
            case "K":
                temp = 13;
            break;
            case "A":
                temp = 14;
            break;
        }
        return temp;
    }
    
    public void cards_out() {
        System.out.println(card_number + " " + card_suit);
    }
    
    public static void main(String[] args) {
        Cards single = new Cards();
        single.set_number("1");
        single.set_suit("Heart");
        single.cards_out();
    }
    
}

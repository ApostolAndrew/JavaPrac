# Card Game
The Card class has 2 attributes: value and suit.

The Deck class has an array of cards. The deck is initialized in order, but can be shuffled using the shuffle function.
Cards are added and removed from the deck using the add and remove functions.

The Player class has two Decks and a name. One Deck is used for the player's hand and the other Deck is used for the player's deck. 
Depending on the card game, the player may not have a hand or the player may not have a deck. 
The Player can draw cards from their deck or from the game deck. The rmHand function is used when the Player plays a card.

The CardGame class has an array of players and a game Deck. The game Deck can be shuffled, then distributed evenly among players.
Players can be added or removed from the CardGame. The players' hands and names can be output. Players can be forced to draw from
the player deck or from the game deck. 

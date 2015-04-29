/*
Ethan J. Quinn
CS 110
Assignment #10 (Due: 04/29/15) - WAR!!! Card Game playing program  - Deck Class
Description: Deck Class for the card game.
*/

//Import appropriate classes
import java.util.Random; 
import java.util.ArrayList;

/**This program represents a players deck of cards extended from Decks*/ 
public class PlayersDecks extends Decks
{
//Variable Declaration
private int cardPointer, cardCounter, NUMBER_OF_DECK_CARDS = 26;

/**This constructor creates an ArrayList to hold the card objects
it also initializes cardPointer & cardCounter*/
public PlayersDecks()
{
deckA = new ArrayList<>(NUMBER_OF_DECK_CARDS);
cardPointer = 0;
cardCounter = -1;
}

/**This method calls to the super to shuffle the deck*/
public void shuffle()
{
super.shuffle();
}

/**This method deals the top card from the deck*/
public Card dealTopCard()
{
Card temp = deckA.remove(0);
//Update cardCounter & cardPointer
cardCounter--;
cardPointer++;

//Output to user if last card in deck is dealt
if (cardPointer == cardCounter)
{
System.out.println("Last card in the deck has been dealt.");
}

//return the top card
return temp;
}

/**This method adds a card to the deck and updates cardCounter*/
public void addCard(Card c)
{
deckA.add(c);
cardCounter++;
}

/**This method removes a card from the deck and updated cardCouner*/
public void removeCard(Card c)
{
deckA.remove(c);
cardCounter--;
}

/**This method returns the current size of the deck*/
public int deckSize()
{
return deckA.size();
}

/**This method returns the number of cards left in the deck*/
public int deckCount()
{
return cardCounter +1;
}

/**This method returns the original number of starting cards in the deck*/
public int startCount()
{
return NUMBER_OF_DECK_CARDS;
}  

}

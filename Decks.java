/*
Ethan J. Quinn
CS 110
Assignment #10 (Due: 04/29/15) - WAR!!! Card Game playing program  - Deck Class
Description: Deck Class for the card game.
*/

//import appropriate classes
import java.util.Random;     //import Random
import java.util.ArrayList;

/**This class represents a deck of cards*/ 
public class Decks
{

//Variable Declaration
//private Card[] deck;
public ArrayList<Card> deckA;
private int cardPointer, CARDS_IN_DECK = 52;

/**This default constructor creates an array to hold the deck and populates the deck with the standard 52 cards*/
public Decks()
{
deckA = new ArrayList<>(CARDS_IN_DECK);
cardPointer = CARDS_IN_DECK - 1;
this.populate();
}

/**This constructor creates an array to hold the deck of size n*/
public Decks(int n)
{
deckA = new ArrayList<Card>(n);
cardPointer = n-1;
}

/**This method populates a deck(arraylist) with the standard 52 cards*/
public void populate()
{
//Create the deck!
int i = 0;

for (int s = 1; s <= 4; s++)
{
      for (int r = 1; r <=13; r++)
      {
      Card temp = new Card(r, s);
      deckA.add(i, temp);
      i++; 
      }
}
} 

/**This method returns the number of cards left in the deck*/
public int deckCount()
{
return cardPointer;
}   
   
/**This method randomly shuffles the cards in the deck*/   
public void shuffle()
{
int a,b, c = deckA.size();
Random rand = new Random();

System.out.println("Shuffling!");

for (int k = 0; k < 1000; k++)
{
a = rand.nextInt(c-1);
b = rand.nextInt(c-1);
Card temp = deckA.get(a);
deckA.set(a, deckA.get(b));
deckA.set(b, temp);
}
cardPointer = deckA.size() - 1;

}

/**This method deals the top card from the deck*/
public Card dealTopCard()
{
Card temp = deckA.get(cardPointer);
//System.out.println("Dealing next card..." + temp.toString());
cardPointer--;

//output to user if last card is dealt
if (cardPointer == -1)
{
System.out.println("Last card in the deck has been dealt.");
}
//return card
return temp;
}

public void addCard(Card c)
{
/**This method adds a card to the deck*/
deckA.add(c);
}

/**This method returns the original number of starting cards in the deck*/
public int startCount()
{
return CARDS_IN_DECK;
} 

}

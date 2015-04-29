/*
Ethan J. Quinn
CS 110
Assignment #5 (Due: 02/25/15) - Card Class
Description: A class that simulates cards out of a deck of 52 playing cards
*/
 
/**
This program represents a deck of cards
*/
public class Card
{
//Variable Declaration
private int rank, suit;
private String stringRank, stringSuit;

 
/**This constructor accepts the rank and suit of the card object*/
public Card(int r, int s)
{
rank = r;
suit = s;
}

/**This method returns the suit of the card object*/
public int getSuit()
{
return suit;
}

/**This method returns the rank of the card object*/
public int getRank()
{
return rank;
}

/**This method assigns a string value depending on the int passed in for suit*/
public String getSuitValue()
{
switch (suit)
   {
   case 1: stringSuit = "Hearts";
   break;
   
   case 2: stringSuit = "Diamonds";
   break;
   
   case 3: stringSuit = "Clubs";
   break;
   
   case 4: stringSuit = "Spades";
   break;
   
   default: stringSuit = "Invalid entry!";
   break;
   }  
   return stringSuit;    
}

/**This method assigns a string value depending on the int passed in for rank*/
public String getRankValue()
{
switch (rank)
   {
   case 1: stringRank = "Ace";
   break;
   
   case 2: stringRank = "Two";
   break;
   
   case 3: stringRank = "Three";
   break;
   
   case 4: stringRank = "Four";
   break;
   
   case 5: stringRank = "Five";
   break;
   
   case 6: stringRank = "Six";
   break;
   
   case 7: stringRank = "Seven";
   break;
   
   case 8: stringRank = "Eight";
   break;
   
   case 9: stringRank = "Nine";
   break;
   
   case 10: stringRank = "Ten";
   break;
   
   case 11: stringRank = "Jack";
   break;
   
   case 12: stringRank = "Queen";
   break;
   
   case 13: stringRank = "King";
   break;
   }
   return stringRank;
}

/**This method concatenates the rank and suit of the card object*/
public String toString()
{
return getRankValue() + " of " + getSuitValue();
}

/**This method compares the rank of two card objects to see if they are equal and returns a boolean*/
public boolean equals(Card c)
{
   if (c.getRank() == rank)
   {
   return true;
   }
   else
   {
   return false;
   }
}

}
 
/*Ethan J. Quinn
CS 110
Assignment #10 (Due: 04/29/15) - WAR!!! Card Game playing program
Description:  A program that plays the card game WAR with the user*/

//import appropriate classes
import javax.swing.JOptionPane; //JOptionPane class

//Class name
public class CardWARs
{
static String updaterC, updaterP;
//main   
public static void main(String [] args)
{
//Variable Declaration
Card computersCard, playersCard, faceDownCard1, faceDownCard2, temporary;
String g3 = "Back";
String h3 = "Back";
updateUpdateC(g3);
updateUpdateP(h3);
WarGUI myPlayArea = new WarGUI();
//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);

//Create the deck
Decks myWarDeck = new Decks();

//Shuffle the deck
myWarDeck.shuffle();

//Create the computersHand, playersHand, and war_fruits extended from Decks class
PlayersDecks computersHand = new PlayersDecks();
PlayersDecks playersHand = new PlayersDecks();
PlayersDecks war_fruits = new PlayersDecks();

//Output to user
System.out.println("Dealing hands...");

//Deal a half the deck to computer
for (int i = 0; i < computersHand.startCount(); i++)
{
Card temp100 = myWarDeck.dealTopCard();
//System.out.println("Adding " + temp100.toString() + " to computersHand");
computersHand.addCard(temp100);
}

//Deal a half the deck to player
for (int i = 0; i < playersHand.startCount(); i++)
{
Card temp110 = myWarDeck.dealTopCard();
//System.out.println("Adding " + temp110.toString() + " to playersHand");
playersHand.addCard(temp110);
}

//Deck counts output to user
System.out.println("Computers deck count: " + computersHand.deckCount());
System.out.println("Your deck count: " + playersHand.deckCount() + "\n");

//Game is ready, keep playing until somebody runs out of cards
while (computersHand.deckCount() > 0 && playersHand.deckCount() > 0)
{
//myPlayArea.revalidate();
//myPlayArea.getAccessibleContext();
myPlayArea = new WarGUI();

//output to user
JOptionPane.showMessageDialog(null,
    "Deal hand? \n(hold down enter to speed through many hands)",
    "Ready to play",
    JOptionPane.QUESTION_MESSAGE);

//flip top cards
computersCard = computersHand.dealTopCard();
playersCard = playersHand.dealTopCard();

//Output to user
String g = computersCard.toString();
String h = playersCard.toString();
System.out.println("COMPUTERS CARD: " + g);
System.out.println("YOUR CARD: " + h);
updateUpdateC(g);
updateUpdateP(h);
//resolve the dealt cards
if (computersCard.getRank() > playersCard.getRank())
{
System.out.println("Computer wins.");
//if computer wins, add cards to computers hand
computersHand.addCard(playersCard);
computersHand.addCard(computersCard);
//Deck counts output to user
System.out.println("Computers new deck count: " + computersHand.deckCount());
System.out.println("Your new deck count: " + playersHand.deckCount() + "\n");
}

else if (computersCard.getRank() < playersCard.getRank())
{
System.out.println("You win!");
//if the player wins, add cards to players hand
playersHand.addCard(playersCard);
playersHand.addCard(computersCard);
//Deck counts output to user
System.out.println("Computers new deck count: " + computersHand.deckCount());
System.out.println("Your new deck count: " + playersHand.deckCount() + "\n");
}

else if (computersCard.getRank() == playersCard.getRank())
{

//Here, the war is handled
System.out.println("******WAR******WAR******WAR******WAR******WAR******WAR******WAR******WAR******WAR******WAR******WAR******WAR******\n");
//Output to user
String g2 = computersCard.toString();
String h2 = playersCard.toString();
System.out.println("COMPUTERS CARD: " + g2);
System.out.println("YOUR CARD: " + h2);
updateUpdateC(g2);
updateUpdateP(h2);
myPlayArea = new WarGUI();

//output to user
JOptionPane.showMessageDialog(null,
    "READY FOR WAR!?",
    "WAR!",
    JOptionPane.QUESTION_MESSAGE);
for (int w = 1; w > 0; w++)
{
//both cards on the table are then up for grabs depending on the final outcome of the war
//so they will be added to the war_fruits hand until it has been determined who has won
war_fruits.addCard(playersCard);
war_fruits.addCard(computersCard);
//next card off the top of each players deck goes face down and are also up for grabs
faceDownCard1 = computersHand.dealTopCard();
faceDownCard2 = playersHand.dealTopCard();
System.out.println("Computer has dealt a card face down.");
System.out.println("You have dealt a card face down.");
//so they will also go into the war_fruits hand
war_fruits.addCard(faceDownCard1);
war_fruits.addCard(faceDownCard2);
//and finally, face up are the cards to determine the winner of the war.
computersCard = computersHand.dealTopCard();
playersCard = playersHand.dealTopCard();
//output to user//Output to user
String g1 = computersCard.toString();
String h1 = playersCard.toString();
System.out.println("COMPUTERS CARD: " + g1);
System.out.println("YOUR CARD: " + h1);
updateUpdateC(g1);
updateUpdateP(h1);
myPlayArea = new WarGUI();
//System.out.println("COMPUTERS CARD: " + computersCard.toString());
//System.out.println("YOUR CARD: " + playersCard.toString());
//These cards are of course also up for grabs
war_fruits.addCard(faceDownCard1);
war_fruits.addCard(faceDownCard2);
//Output to user
System.out.println("Cards up for grabs: " + war_fruits.deckSize());

if (computersCard.getRank() > playersCard.getRank())
{
System.out.println("Computer wins.");
//If computer wins, add the contents of war_fruits to computers hand
int holder = war_fruits.deckSize();
for (int b = 0; b < holder; b++)
{
temporary = war_fruits.dealTopCard();
computersHand.addCard(temporary);
}
//Deck counts output to user
System.out.println("Computers new deck count: " + computersHand.deckCount());
System.out.println("Your new deck count: " + playersHand.deckCount() + "\n");
break;
}

else if (computersCard.getRank() < playersCard.getRank())
{
System.out.println("You win!");
//If player wins, add the contents of war_fruits to players hand
int holder1 = war_fruits.deckSize();
for (int b = 0; b < holder1; b++)
{
temporary = war_fruits.dealTopCard();
playersHand.addCard(temporary);
}
//Deck counts output to user
System.out.println("Computers new deck count: " + computersHand.deckCount());
System.out.println("Your new deck count: " + playersHand.deckCount() + "\n");
break;
}
else if (computersCard.getRank() == playersCard.getRank())
{
//If there's another war, loop will repeat
System.out.println("WAR AGAIN!");

JOptionPane.showMessageDialog(null,
    "READY FOR ANOTHER WAR!?",
    "WAR AGAIN!",
    JOptionPane.QUESTION_MESSAGE);
    
}
}
}
}
//Game over output to user
if (playersHand.deckCount() == 0)
{
System.out.println("You lost, you ran out of cards");
}
else if (computersHand.deckCount() == 0)
{
System.out.println("You Won!  The computer ran out of cards!");
}

}
public static void updateUpdateC(String z)
{
updaterC = z;
}
public String getUpdateC()
{
return updaterC; 
}
public static void updateUpdateP(String y)
{
updaterP = y;
}
public String getUpdateP()
{
return updaterP; 
}

}
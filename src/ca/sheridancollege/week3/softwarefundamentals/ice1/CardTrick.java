package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and searches for a specific luckyCard.
 * * @author Roy Nissi
 * @studentNumber 991793129
 * @modified [Insert Today's Date] [cite: 15]
 */
public class CardTrick {

    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7]; // Step: Create array of 7 cards 
        Random random = new Random();
        
        // Fill the array with random cards 
        for (int i=0; i < magicHand.length; i++)
        {
            Card c = new Card();
            // Choose random number values (1-13) 
            c.setValue(random.nextInt(13) + 1);
            // Choose random suits from the suits array 
            c.setSuit(Card.SUITS[random.nextInt(4)]);

            magicHand[i] = c;
        }

        // STEP 7: Hard-coded luckyCard (Replaces Scanner input) 
        Card luckyCard = new Card();
        luckyCard.setValue(7); 
        luckyCard.setSuit("Spades"); 
        
        // Search the array for the luckyCard 
        boolean found = false;
        for (Card card : magicHand) {
            if (card.getValue() == luckyCard.getValue() &&
                card.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // Report winning or losing message 
        if (found) {
            System.out.println("Success! The lucky card is in the magic hand.");
        } else {
            System.out.println("Sorry, the lucky card is not in the magic hand.");
        }
    }
}
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Roy Nissi
 * @studentNumber 991793129
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random random = new Random();

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();

            c.setValue(random.nextInt(13) + 1);
            
            c.setSuit(Card.SUITS[random.nextInt(4)]);
            
            magicHand[i] = c;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your card value (1-13): ");
        int userValue = input.nextInt();
        
        System.out.println("Enter your card suit (0: Hearts, 1: Diamonds, 2: Spades, 3: Clubs): ");
        int suitIndex = input.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[suitIndex]);

        boolean isFound = false;
        for (Card card : magicHand) {
            if (card.getValue() == userCard.getValue() && 
                card.getSuit().equals(userCard.getSuit())) {
                isFound = true;
                break;
            }
        }
        
        if (isFound) {
            System.out.println("Success! Your card is in the magic hand.");
        } else {
            System.out.println("Sorry, your card is not in the magic hand.");
        }
    }
}
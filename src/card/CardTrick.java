/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Jobanpreet Singh
 * Student Number 991706006
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            int value =random.nextInt(13)+ 1;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            String suit = Card.SUITS[random.nextInt(Card.SUITS.length)];
            c.setValue(value);
            c.setSuit(suit);
            magicHand[i] = c;
        }
        Card luckyCard = new Card();
        luckyCard.setValue(10);
        luckyCard.setSuit("Hearts");
        magicHand[7] = luckyCard;
        
         Scanner scanner = new Scanner(System.in);
        System.out.print("Pick a card: ");
        int value = scanner.nextInt();
        scanner.nextLine();
        String suit = scanner.nextLine();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
        boolean found = false;

        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}

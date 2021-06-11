/*Student number: 991588433
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.exercise1;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Alpa
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();         
            c.setValue(random.nextInt(13));
            c.setSuit(Card.SUITS[random.nextInt(4)]);
        }
        
        //inserted code to ask the user for Card value and suit, create their card
        System.out.println("Pick a suit from\n Hearts\n Diamonds\n Spades\n clubs");
        String suit = input.nextLine();
        
        System.out.println("Pick a value from 1 to 13");
        int value = input.nextInt();
        //Print the card which user has picked
        System.out.println("You selected the " + suit + " from suits " + " and " + value + " from value. ");
        
        
        // and search magicHand here
        //Then report the result here
    }
    
}

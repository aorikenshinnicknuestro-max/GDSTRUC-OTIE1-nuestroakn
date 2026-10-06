import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        CardStack playerDeck = new CardStack(30);
        CardStack playerHand = new CardStack(30);
        CardStack discardPile = new CardStack(30);

        for(int i = 1; i <= 30; i++){
            playerDeck.push(new Card("Card " + i));
        }

        while(!playerDeck.isEmpty()) {

            int command = random.nextInt(3) + 1;
            int number = random.nextInt(5) + 1;

            if (command == 1){
                System.out.println("Draw " + number + " card(s)");

                for (int i = 0; i < number; i++) {
                    if (!playerDeck.isEmpty()) {
                        playerHand.push(playerDeck.pop());
                    }
                }
            }

            else if (command == 2){
                System.out.println("Discard " + number + " card(s)");

                for (int i = 0; i < number; i++){
                    if (!playerHand.isEmpty()) {
                        discardPile.push(playerHand.pop());
                    }
                }
            }

            else if (command == 3){
                System.out.println("Get " + number+ " card(s) from the discarded pile");

                for (int i = 0; i < number; i++){
                    if (!discardPile.isEmpty()){
                        playerHand.push(discardPile.pop());
                    }
                }
            }

            System.out.println();
            System.out.println("Your Hand: ");
            System.out.println("Card Hand Count: " + playerHand.size());
            System.out.println("Card Deck Count: " + playerDeck.size());
            System.out.println("Card Discard Pile Count: " + discardPile.size());

            if (!playerDeck.isEmpty()){
                System.out.println();
                System.out.println("Press Enter to Proceed...");
                input.nextLine();
            }
        }

        System.out.println();
        System.out.println("The Deck is Zero");
        System.out.println("Game's done!");

        input.close();

    }
}
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayQueue queue = new ArrayQueue(3);

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int gamesCreated = 0;

        int idCounter = 1;

        System.out.println("=== MATCHMAKING... ===");

        while (gamesCreated < 10){

            System.out.print("\nPress ENTER to end your turn...");
            scanner.nextLine();

            int x =rand.nextInt(7) + 1;
            System.out.println("Adding " + x + " player to the match...\n");

            for (int i = 0; i < x; i++){
                queue.enqueue(new Player(idCounter, "Player_" + idCounter, 100));
                idCounter++;
            }

            queue.printQueue();
            System.out.println("\nCurrent Front: " + queue.peek());
            System.out.println("Current Queue Size: " + queue.size());

            if (queue.size() >=5) {
                gamesCreated++;

                System.out.println("\n*** GAME #" + gamesCreated+ " STARTED! ***");

                for (int i = 0; i < 5; i++){
                    System.out.println("Removing Player " + queue.dequeue());
                }


                System.out.println("\n--- Queue State After Match ---");
                queue.printQueue();
                System.out.println("*********************************\n");
            }


        }

        System.out.println("=================================================");
        System.out.println("SUCCESS: 10 Games are here, Program Has Ended!");
        System.out.println("=================================================");

        scanner.close();
    }
}
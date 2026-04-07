import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.instructions();
        game.play();

    }
}




class Game{

    //My function for the basic instructions for the game.
    public void instructions(){
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        System.out.println("Can you guess it?");
    }



    public void play(){
        Random rand = new Random();
        Scanner scanner = new Scanner (System.in);
        int number = rand.nextInt(100) + 1;

        int attempts = 0;

        int maxAttempts = 10;


//Creating the loop to handle the attempts and maxAttempts of the user
//This will display the messages for the user.
        while (attempts < maxAttempts){

            System.out.print("Enter your guess: ");

            int guess = scanner.nextInt();
            attempts++;


            if (guess < number){
                System.out.println(" ");
                System.out.println("Too low! Guess again.");

            } else if (guess == number) {
                System.out.println(" ");
                System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
                break;
            }
            else{
                System.out.println(" ");
                System.out.println("Too high! Guess again.");

            }

            if(attempts < maxAttempts){
                System.out.println(" ");
                System.out.println("You have " + (maxAttempts - attempts) + " attempts left.");
            }
            else{
                System.out.println("Game Over! The number was " + number );
            }
        }



    }



}
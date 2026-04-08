
//Here is all my imports, to be able to use the Random, Scanner and ArrayList APIs in my code
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;


//This is my Main class.
//This class calls my instructions function and my Game class.
public class Main {

    public static void main(String[] args) {
        Playable game = new Game();
        game.instructions();
        game.play();

    }
}


//I create an interface and I used it with the implements keywork within my Game class.
interface Playable {
    void play();
    void instructions();
}


//My Game Class contain the implements keyword to use the interface in Java.
class Game implements Playable {

//My function for the basic instructions for the game.
//this is to help the user the basic concept of the game, the user needs to guess a number between 1 and 100.
    public void instructions(){
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        System.out.println("Can you guess it?");
    }


//My play function contains all the logic of the game
//I created variables to handle the attempts of the user
//And to handle the maxAttempts, there are only 10 attempts to guess the number.
    public void play(){
        try {
            Random rand = new Random();
            Scanner scanner = new Scanner (System.in);

            int number = rand.nextInt(100) + 1;

            int attempts = 0;

            int maxAttempts = 10;
            ArrayList<Integer> guesses = new ArrayList<>();


//I created a WHILE loop to handle the attempts and maxAttempts of the user
//This will display all the necessary messages for the user in case the number
//it is too low or too high.
            while (attempts < maxAttempts){

                System.out.print("Enter your guess: ");

                int guess = scanner.nextInt();
                attempts++;

                guesses.add(guess);

                if (guess < number){
                    System.out.println(" ");
                    System.out.println("Too low! Guess again.");
                }

                else if (guess == number) {
                    System.out.println(" ");
                    System.out.println("🎉 Congratulations! You guessed the number in " + attempts + " attempts.");
                    System.out.println("Your guesses were " + guesses);
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
                    System.out.println("Your guesses were " + guesses);
                }
            }
        } catch (Exception exception){
            System.out.println("Sorry, that guess is not a number!");
        }




    }


}
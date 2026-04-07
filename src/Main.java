import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {

        instructions();
        game();

    }



    public static void instructions(){
        System.out.println("Welcome to the Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        System.out.println("Can you guess it?");
    }


    public static void game(){
        Random rand = new Random();
        Scanner scanner = new Scanner (System.in);
        int number = rand.nextInt(100) + 1;

        int attempts = 0;

        int maxAttempts = 10;



        while (attempts < maxAttempts){

            System.out.print("Enter your guess: ");

            int guess = scanner.nextInt();
            attempts++;


            if (guess < number){
                System.out.println(" ");
                System.out.println("Too low! Guess again.");

            } else if (guess == number) {
                System.out.println(" ");
                System.out.println("Congratulations, you guessed the number in "+ attempts + " " + "attempts.");
                break;
            }
            else if (guess > number){
                System.out.println(" ");
                System.out.println("Too high! Guess again.");
            }





            if(attempts < maxAttempts){
                System.out.println(" ");
                System.out.println("Te quedan " + (maxAttempts - attempts) + " intentos.");
            }
            else{
                System.out.println("Se acabaron tus intentos, el numero era " + number );
            }
        }





    }

}
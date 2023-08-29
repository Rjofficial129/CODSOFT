import java.util.Scanner;
import java.util.Random;

class Game{
    Scanner sc = new Scanner(System.in);
    int randomNumber,userInput;
    int guesses = 0;
    int turns = 10;
    public Game(){
        Random r = new Random();
        randomNumber = r.nextInt(1,100);
    }
    public void getGuessNumber()
    {
        userInput = sc.nextInt();
        System.out.println("");
        System.out.println("You guessed number is: "+userInput);
    }
    public void gameFunction(){
        for (int i=0;i<=turns;i++){
            if (i>=turns){
                System.out.println("\nYou have been failed to guess the number");
                System.out.println("The number was:-"+randomNumber);
                break;
            }
            getGuessNumber();
            if (randomNumber==userInput){
                System.out.println("Congrats you guess the number in "+guesses+" turns");
                break;
            }
            else if (randomNumber>userInput){
                System.out.println("Guess is too low");
                guesses++;
            }
            else if (randomNumber<userInput){
                System.out.println("Guess is too high");
                guesses++;
            }
            if (userInput>100){
                System.out.println("\nYou have been told to guess the no. between 1 to 100");
            }
        }
    }
}

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to guess the number game");
        System.out.println("You have to guess the no. between 1 to 100 and you will get 10 turns.\nLet's Start:");
        Game player = new Game();
        player.gameFunction();
    }
}
import java.util.Scanner;

public class NumberGame {
    public void menu(){
        System.out.println("ENTER YOU CHOICE");
        System.out.println("1. FOR SINGLE ROUND");
        System.out.println("2. For Multiple Round");
        Scanner sc =new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt == 1){
            singleRound();
        }else if(opt == 2){
            multipleRound();

        }
        else{
            System.out.println("ENTER A VALID CHOICE");

        }
    }
    public void singleRound(){
        int random100 = (int) (Math.random()*100+1);
       // System.out.println("Random number 1 and 100:"+random100);
        Scanner scs = new Scanner(System.in);
        System.out.println("Enter your Guess");
        int a = scs.nextInt();
        if (random100==a){
            System.out.println("You Guess The Correct Number");
        }
        else {
            System.out.println("Retry");
            menu();
        }


    }
    public void multipleRound(){


    }
}


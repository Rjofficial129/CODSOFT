import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 1234;

    public void checkpin(){
        System.out.println("ENTER YOUR VALID PIN: ");
        Scanner scs = new Scanner(System.in);
        int enteredPin = scs.nextInt();
        if (enteredPin==PIN){
            menu();
        }
        else {
            System.out.println("PLEASE ENTER A VALID PIN AND TRY AGAIN LATER");

        }



    }
    public void menu(){
        System.out.println("ENTER YOU CHOICE");
        System.out.println("1. CHECK A/C BALANCE");
        System.out.println("2. WITHDRAW MONEY");
        System.out.println("3. DEPOSIT MONEY");

        Scanner scs = new Scanner(System.in);
        int opt = scs.nextInt();

        if (opt == 1){
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();

        } else if (opt == 3) {
            depositMoney();


        } else {
            System.out.println("ENTER A VALID CHOICE");

        }
    }
    public void checkBalance(){
        System.out.println("Balance:" + Balance);
        menu();
    }

    public void withdrawMoney(){
        System.out.println("ENTER YOUR AMOUNT TO WITHDRAW: ");
        Scanner scs = new Scanner(System.in);
        float amount = scs.nextInt();
        if (amount>Balance){
            System.out.println("INSUFFICIANT BALANCE");
        }
        else {
            Balance = Balance - amount;
            System.out.println("MONEY WITHDRAWL SUCCESSFULLY");

        }
        menu();
    }
    public void depositMoney(){
        System.out.println("ENTER THE AMOUNT TO DEPOSIT: ");
        Scanner scs = new Scanner(System.in);
        float amount = scs.nextFloat();
        Balance = Balance + amount;
        System.out.println("MONEY DEPOSITED SUCCESSFULLY");
        menu();
    }
}


public class ATMMachine  {
    public static void main(String[]args){

        ATM obj = new ATM();
        obj.checkpin();

    }
}

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Sudeep on 5/25/2017.
 */
public class GuessingGame {
    public static void main(String arg[]){
        String play="y";
        while(play.equals("y") || play.equals("Y") || play.equals("yes") || play.equals("YES")){
            int humanAttempt=humanGuess();
            System.out.println("Now its computer's turn to Guess !!!");
            int compAttempt=computerGuess();
            if (humanAttempt==compAttempt){
                System.out.println("********** Match Draw ***********");
            }
            if(humanAttempt<compAttempt){
                System.out.println("******** Congratulation You Win ********");
            }
            else
                System.out.println("************* You lose *********");

            System.out.print("do you want to play more: ");
            Scanner input = new Scanner(System.in);
            play=input.next();
        }

    }

    public static int computerGuess(){
        int r1=1,r2=100, attempt=1;
        System.out.println("Choose any Number bw 1 to 100:");
        int compGuess=getRandom1(r1, r2);
        System.out.println("Your number is=" + compGuess);
        System.out.print("is this correct(y/n)?:");
        Scanner value=new Scanner(System.in);
        String response1=value.next();
        while(!(response1.equals("Y")) && !(response1.equals("y")) && !(response1.equals("yes")) && !(response1.equals("YES")) && !(response1.equals("N")) && !(response1.equals("n")) && !(response1.equals("no")) && !(response1.equals("NO"))){
            System.out.print("Please enter correct value(y/n):");
            response1=value.next();
        }
        if(response1.equals("Y") || response1.equals("y") || response1.equals("YES") || response1.equals("Yes") || response1.equals("Yes")){
            System.out.println("i guessed you number in 1st attempt");
            System.exit(0);
        }
        System.out.print("your number is greater or less than guessed number(G/L)");
        String response2=value.next();
        while(response1.equals("N")|| response1.equals("n") || response1.equals("NO") || response1.equals("No") || response1.equals("no")){
            if(response2.equals("G") || response2.equals("g") || response2.equals("GREATER") || response2.equals("Greater") || response2.equals("greater")){
                attempt++;
                r1=compGuess;
                compGuess=getRandom1(r1, r2);
                System.out.println("Your number is=" + compGuess);
                System.out.print("is this correct(y/n)?:");
                response1=value.next();
                if(response1.equals("y") || response1.equals("Y") || response1.equals("yes") || response1.equals("YES")){
                    break;
                }
                System.out.print("your number is greater or less than guessed number(G/L)");
                response2=value.next();

            }
            else{
                attempt++;
                r2=compGuess;
                compGuess=getRandom1(r1, r2);
                System.out.println("Your number is=" + compGuess);
                System.out.print("is this correct(y/n)?:");
                response1=value.next();
                if(response1.equals("y") || response1.equals("Y") || response1.equals("yes") || response1.equals("YES")){
                    break;
                }

                System.out.print("your number is greater or less than guessed number(G/L)");
                response2=value.next();
            }
        }
        System.out.println("i guessed you number in " +attempt + " attempt");
        return attempt;


    }
    public static int humanGuess(){
        int attempt=1;
        System.out.println("*******  Welcome to the Game of guessing  *******");
        int random= getRandom();
        int guess=guessNumber();

        if(guess==random){
            System.out.println("***** Congratulation You Win *****");
            System.out.println("You have guessed in 1 attempt");
            System.exit(0);
        }
        while(guess!=random){
            if(guess>random){
                System.out.println("your number is greater than Base number.!!!!  Keep going");
                attempt++;
                guess=guessNumber();
            }
            else{
                System.out.println("your number is less than Base number.!!!!  Keep going");
                attempt++;
                guess=guessNumber();
            }
        }
        System.out.println("***** Congratulation You Win *****");
        System.out.println("You have taken " +attempt +" attempt to complete the game");
        return attempt;

    }
    public static int guessNumber() {
        System.out.println("Guess any number:");
        Scanner input=new Scanner(System.in);
        int guessNum=input.nextInt();
       // System.out.println("Guessed number is:" + guessNum);
        return guessNum;
    }
    public static int getRandom(){
        System.out.println("i have taken a number bw 1 to 100!!!   Guesss that Number");
        Random rand=new Random();
        int randomNum=rand.nextInt(100)+1;
        System.out.println("random number is=" + randomNum);
        return randomNum;

    }
    public static int getRandom1(int min, int max){
        int range=max-min+1;
        Random rand=new Random();
        int randomNum=rand.nextInt(range)+min;
        return randomNum;

    }

}

import java.util.Scanner;

public class GuessNumGame {
    

    public boolean GuessTheNum(int numberToGuess){
        int randomNum = (int)(Math.random()*11);
        System.out.println(randomNum);
        return numberToGuess == randomNum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to guess from 0 to 10");
        int numberEntered = in.nextInt();
        GuessNumGame Gn = new GuessNumGame();
        boolean statusGuessed = Gn.GuessTheNum(numberEntered);
        if(statusGuessed){
            System.out.println("You Guess the number!! Congrats");
        }else{
            System.out.println("Better luck next time!");
        }
        in.close();
    }
}

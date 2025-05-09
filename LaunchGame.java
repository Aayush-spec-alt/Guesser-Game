import java.util.Scanner;

class Player
{
    int numGuess;
    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Player, please guess a number between 1 and 10");
        numGuess = sc.nextInt();
        return numGuess;
        
    }

}   


class Guesser
{
    int numGuess;
    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey Guesser, please guess a number between 1 and 10");
        numGuess = sc.nextInt();
        return numGuess;
        
    }

}

class Umpire
{
    Guesser guesser;
    Player p1,p2,p3;

    public void getNumberFromGuesser()
    {
        guesser = new Guesser();
        guesser.guessNumber();
    }
    public void collectFromPlayers()
    {
        p1 = new Player();
        p2 = p1;
        p3 = p1;
        p1 = p1.guessNumber();
        p2 = p2.guessNumber();
        p3 = p3.guessNumber();
    }
    public void calcResult()
    {
        System.out.println(guesser.numGuess + " " + p1.numGuess + " " + p2.numGuess + " " + p3.numGuess);
        System.out.println("Logic not implemented yet");
    }
    
}


public class LaunchGame {


    public static void main(String[] args) {
        Umpire umpire = new Input();
        umpire.getNumberFromGuesser();
        umpire.collectFromPlayers();
        umpire.calcResult();



    }



}
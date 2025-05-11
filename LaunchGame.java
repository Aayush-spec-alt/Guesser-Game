import java.util.Scanner;

class Player {
    int numGuess;

    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey Player, please guess a number between 1 and 10: ");
        numGuess = sc.nextInt();
        return numGuess;
    }
}

class Guesser {
    int numGuess;

    public int guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hey Guesser, please guess a number between 1 and 10: ");
        numGuess = sc.nextInt();
        return numGuess;
    }
}

class Umpire {
    int guesserNum;
    int p1Num, p2Num, p3Num;

    public void getNumberFromGuesser() {
        Guesser guesser = new Guesser();
        guesserNum = guesser.guessNumber();
    }

    public void collectFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        p1Num = p1.guessNumber();
        p2Num = p2.guessNumber();
        p3Num = p3.guessNumber();
    }

    public void calcResult() {
        System.out.println("\nGuesser's number: " + guesserNum);
        System.out.println("Player 1 guessed: " + p1Num);
        System.out.println("Player 2 guessed: " + p2Num);
        System.out.println("Player 3 guessed: " + p3Num);

        boolean p1Correct = (p1Num == guesserNum);
        boolean p2Correct = (p2Num == guesserNum);
        boolean p3Correct = (p3Num == guesserNum);

        if (p1Correct && p2Correct && p3Correct) {
            System.out.println("All players guessed correctly! It's a tie.");
        } else if (p1Correct && p2Correct) {
            System.out.println("Player 1 and Player 2 won!");
        } else if (p1Correct && p3Correct) {
            System.out.println("Player 1 and Player 3 won!");
        } else if (p2Correct && p3Correct) {
            System.out.println("Player 2 and Player 3 won!");
        } else if (p1Correct) {
            System.out.println("Player 1 won!");
        } else if (p2Correct) {
            System.out.println("Player 2 won!");
        } else if (p3Correct) {
            System.out.println("Player 3 won!");
        } else {
            System.out.println("No one guessed correctly. Try again!");
        }
    }
}

public class LaunchGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGuesser();
        umpire.collectFromPlayers();
        umpire.calcResult();
    }
}

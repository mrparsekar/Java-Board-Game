import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] possibleWords = {"master", "student", "hello", "encapsulation", "abstraction"};
        Random random = new Random();
        String selectedWord = possibleWords[random.nextInt(possibleWords.length)];

        GuessingGame game = new GuessingGame(selectedWord, 6);
        game.start();
    }
}

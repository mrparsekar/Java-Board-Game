import java.util.Scanner;

public class GuessingGame extends GameBase {
    private MysteryWord mysteryWord;
    private Player player;

    public GuessingGame(String word, int maxAttempts) {
        super(maxAttempts);
        this.mysteryWord = new MysteryWord(word);
        this.player = new Player();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        while (!isGameEnded() && !mysteryWord.isRevealed()) {
            System.out.println("Current word: " + mysteryWord.displayWord());
            System.out.println("Attempts remaining: " + getRemainingAttempts());
            System.out.print("Guess a letter: ");
            char guess = scanner.nextLine().charAt(0);

            if (mysteryWord.attemptGuess(guess)) {
                if (!mysteryWord.hasCharacter(guess)) {
                    decrementAttempts();
                }
            }

            if (mysteryWord.isRevealed()) {
                System.out.println("Well done! You've guessed the word: " + mysteryWord.getTargetWord());
                break;
            } else if (getRemainingAttempts() <= 0) {
                System.out.println("Game over! The word was: " + mysteryWord.getTargetWord());
            }
        }
        scanner.close();
    }
}

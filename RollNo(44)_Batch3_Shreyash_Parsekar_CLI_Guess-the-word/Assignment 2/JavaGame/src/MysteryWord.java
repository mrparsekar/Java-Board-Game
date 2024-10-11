import java.util.HashSet;
import java.util.Set;

public class MysteryWord {
    private String targetWord;
    private Set<Character> guessedCharacters;

    public MysteryWord(String targetWord) {
        this.targetWord = targetWord.toLowerCase();
        this.guessedCharacters = new HashSet<>();
    }

    public boolean attemptGuess(char character) {
        character = Character.toLowerCase(character);
        if (guessedCharacters.contains(character)) {
            System.out.println("Letter has already been guessed.");
            return false;
        } else {
            guessedCharacters.add(character);
            return true;
        }
    }

    public boolean hasCharacter(char character) {
        return targetWord.indexOf(character) >= 0;
    }

    public boolean isRevealed() {
        for (char character : targetWord.toCharArray()) {
            if (!guessedCharacters.contains(character)) {
                return false;
            }
        }
        return true;
    }

    public String displayWord() {
        StringBuilder display = new StringBuilder();
        for (char character : targetWord.toCharArray()) {
            if (guessedCharacters.contains(character)) {
                display.append(character);
            } else {
                display.append('_');
            }
            display.append(' ');
        }
        return display.toString().trim();
    }

    public String getTargetWord() {
        return targetWord;
    }
}

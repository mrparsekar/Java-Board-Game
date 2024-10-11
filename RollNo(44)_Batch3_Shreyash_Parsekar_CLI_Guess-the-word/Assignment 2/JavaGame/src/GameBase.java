public class GameBase {
    private int remainingAttempts;

    public GameBase(int maxAttempts) {
        this.remainingAttempts = maxAttempts;
    }

    public boolean isGameEnded() {
        return remainingAttempts <= 0;
    }

    public int getRemainingAttempts() {
        return remainingAttempts;
    }

    protected void decrementAttempts() {
        remainingAttempts--;
    }
}

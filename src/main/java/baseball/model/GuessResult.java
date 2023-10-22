package baseball.model;

import static baseball.Constants.NUMBER_COUNTS;

public class GuessResult {

    private static final int INITIAL_ZERO_COUNT = 0;

    private int strikeCount = INITIAL_ZERO_COUNT;
    private int ballCount = INITIAL_ZERO_COUNT;

    public void addStrikeCount() {
        this.strikeCount++;
    }

    public void addBallCount() {
        this.ballCount++;
    }

    public boolean isGameEnd() {
        return strikeCount == NUMBER_COUNTS;
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    public boolean isNothing() {
        return strikeCount == INITIAL_ZERO_COUNT && ballCount == INITIAL_ZERO_COUNT;
    }
}

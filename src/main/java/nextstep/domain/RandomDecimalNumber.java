package nextstep.domain;

import nextstep.utils.Randoms;

public class RandomDecimalNumber implements RandomWay {
    private static final int MOVABLE_NUMBER = 4;
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;

    public boolean movable() {
        int randomNumber = getRandomNumber();
        return MOVABLE_NUMBER <= randomNumber;
    }

    private int getRandomNumber() {
        return Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }
}

package nextstep.domain;

public class Driver {
    private static final int MOVABLE_NUMBER = 4;

    public boolean movable(int inputNumber) {
        return MOVABLE_NUMBER <= inputNumber;
    }
}

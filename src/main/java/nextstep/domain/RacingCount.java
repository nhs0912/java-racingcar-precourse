package nextstep.domain;

import nextstep.exception.MyErrorCode;
import nextstep.exception.MyException;

public class RacingCount {
    private static final String INIT_RACE_COUNT = "0";
    private int raceCount;

    public RacingCount(){
        this(INIT_RACE_COUNT);
    }

    public RacingCount(String racingCount) {
        checkChangeTextToNumber(racingCount);
        this.raceCount = Integer.parseInt(racingCount);
    }

    public int raceCount(){
        return this.raceCount;
    }

    public boolean inputRaceCountReadyToGo(){
        return this.raceCount > 0;
    }

    private void checkChangeTextToNumber(String racingCountText) {
        try {
            Integer.parseInt(racingCountText);
        } catch (NumberFormatException e) {
            throw new MyException(MyErrorCode.INVALID_GAME_COUNT);
        }
    }
}

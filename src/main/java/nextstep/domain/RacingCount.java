package nextstep.domain;

import nextstep.exception.MyErrorCode;
import nextstep.exception.MyException;

public class RacingCount {
    private static final int INIT_RACE_COUNT = 0;
    private int raceCount;

    public RacingCount(){
        this.raceCount = INIT_RACE_COUNT;
    }

    public RacingCount(String racingCountText) {
        checkChangeTextToNumber(racingCountText);
        checkInputNumberLessThanZero(racingCountText);
        this.raceCount = changeStringToInt(racingCountText);
    }

    public int raceCount(){
        return this.raceCount;
    }

    public boolean inputRaceCountReadyToGo(){
        return this.raceCount > INIT_RACE_COUNT;
    }

    private void checkChangeTextToNumber(String racingCountText) {
        try {
            changeStringToInt(racingCountText);
        } catch (NumberFormatException e) {
            throw new MyException(MyErrorCode.INVALID_GAME_COUNT);
        }
    }

    private int changeStringToInt(String racingCountText) throws NumberFormatException{
        return Integer.parseInt(racingCountText);
    }

    private void checkInputNumberLessThanZero(String racingCountText){
        if(changeStringToInt(racingCountText) <= INIT_RACE_COUNT){
            throw new MyException(MyErrorCode.GAME_COUNT_LESS_THAN_OR_EQUAL_TO_ZERO);
        };
    }
}

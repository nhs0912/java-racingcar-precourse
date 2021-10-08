package nextstep.exception;

public enum MyErrorCode {
    INVALID_LENGTH_OF_NAME("[ERROR] 이름은 1글자 이상 5글자 이하만 가능합니다."),
    INVALID_GAME_COUNT("[ERROR] 횟수는 숫자만 입력할 수 있습니다."),
    HAS_DUPLICATED_NAME("[ERROR] 중복된 이름이 있습니다."),
    GAME_COUNT_LESS_THAN_OR_EQUAL_TO_ZERO("[ERROR] 게임횟수는 0이하를 입력할수 없습니다.");

    private String errorMessage;

    MyErrorCode(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String errorMessage() {
        return this.errorMessage;
    }
}

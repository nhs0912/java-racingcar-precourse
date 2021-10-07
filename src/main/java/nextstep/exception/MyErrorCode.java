package nextstep.exception;

public enum MyErrorCode {
    INVALID_LENGTH_OF_NAME("이름은 5자 이하만 가능합니다.");

    private String errorMessage;

    MyErrorCode(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String errorMessage() {
        return this.errorMessage;
    }
}

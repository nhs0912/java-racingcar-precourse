package nextstep.exception;

public class MyException extends RuntimeException {
    private MyErrorCode myErrorCode;
    private String errorMessage;

    public MyException(MyErrorCode errorCode) {
        this(errorCode, errorCode.errorMessage());
        this.myErrorCode = errorCode;
    }

    public MyException(MyErrorCode errorCode, String errorMessage) {
        super(errorMessage);
        this.myErrorCode = errorCode;
        this.errorMessage = errorMessage;
    }
}

package nextstep.domain;

import nextstep.exception.MyErrorCode;
import nextstep.exception.MyException;

public class Name {
    private static final int MIN_NAME_LENGTH = 1;
    private static final int MAX_NAME_LENGTH = 5;
    private String name;

    public Name(String inputName) {
        checkMoreThanFiveOfNameLength(inputName);
        this.name = inputName;
    }

    public String name() {
        return this.name;
    }

    private void checkMoreThanFiveOfNameLength(String inputName) {
        if (!isValidNameLength(inputName)) {
            throw new MyException(MyErrorCode.INVALID_LENGTH_OF_NAME);
        }
    }

    private boolean isValidNameLength(String inputName) {
        return MIN_NAME_LENGTH <= inputName.length() && inputName.length() <= MAX_NAME_LENGTH;
    }
}

package nextstep.view;

import nextstep.utils.Console;

public class InputView {
    public String printInputCarName() {
        System.out.println("경주할 자동차이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        return Console.readLine();
    }

    public String printInputGameCount() {
        System.out.println("시도할 횟수는 몇회인가요?");
        return Console.readLine();
    }
}

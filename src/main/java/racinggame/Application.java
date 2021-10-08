package racinggame;

import nextstep.domain.Cars;
import nextstep.service.RacingService;

public class Application {
    public static void main(String[] args) {
        RacingService racingService = new RacingService();
        Cars cars = racingService.inputCarInfo();
        int racingGameCount = racingService.inputGameCount();

        racingService.start(racingGameCount, cars);
        racingService.showWinners();
    }
}

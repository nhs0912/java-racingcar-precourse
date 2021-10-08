package nextstep.service;

import nextstep.domain.Cars;
import nextstep.domain.RacingCount;
import nextstep.exception.MyException;
import nextstep.view.InputView;
import nextstep.view.OutputView;

public class RacingService {
    private Cars cars;
    private static InputView inputView;
    private static OutputView outputView;

    public RacingService() {
        if (inputView == null) {
            inputView = new InputView();
        }

        if (outputView == null) {
            outputView = new OutputView();
        }
    }

    public Cars inputCarInfo() {
        Cars cars = new Cars();
        while (!cars.isReadyToGo()) {
            cars = makeCars(cars);
        }
        return cars;
    }

    private Cars makeCars(Cars cars) {
        try {
            String carNames = inputView.printInputCarName();
            cars = new Cars(carNames);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return cars;
    }

    public int inputGameCount() {
        RacingCount racingCount = new RacingCount();
        while (!racingCount.inputRaceCountReadyToGo()) {
            racingCount = inputRacingCount(racingCount);
        }
        return racingCount.raceCount();
    }

    private RacingCount inputRacingCount(RacingCount racingCount) {
        try {
            String gameCount = inputView.printInputGameCount();
            racingCount = new RacingCount(gameCount);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return racingCount;
    }

    public void start(int racingGameCount, Cars cars) {
        outputView.printExecuteResultText();
        while (racingGameCount-- > 0) {
            cars.startRacing();
            outputView.printRacingResult(cars.cars());
        }
        this.cars = cars;
    }

    public void showWinners() {
        outputView.printWinners(cars.findWinners());
    }
}

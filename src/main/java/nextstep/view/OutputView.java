package nextstep.view;

import nextstep.domain.Car;
import nextstep.domain.Position;

import java.util.List;

public class OutputView {
    private static final String DISTANCE = "-";
    private static final int START_WINNER_NAME_INDEX = 0;

    public void printExecuteResultText() {
        System.out.println("실행결과");
    }

    public void printRacingResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.print(car.name() + " : ");
            System.out.println(printCarDistance(car.position()));
        }
        System.out.println();
    }

    public void printWinners(List<Car> cars) {
        String resultWinnerText = new String("최종 우승자는 ");
        resultWinnerText += getWinners(cars, resultWinnerText);
        resultWinnerText += " 입니다.";
        System.out.println(resultWinnerText);
    }

    private String getWinners(List<Car> cars, String resultWinnerText) {
        String winnersName = new String();
        for (Car car : cars) {
            winnersName += car.name() + ",";
        }
        resultWinnerText += winnersName.substring(START_WINNER_NAME_INDEX, winnersName.lastIndexOf(','));
        return resultWinnerText;
    }

    private String printCarDistance(Position position) {
        StringBuilder totalDistance = new StringBuilder();
        for (int i = 0; i < position.distance(); i++) {
            totalDistance.append(DISTANCE);
        }
        return totalDistance.toString();
    }
}

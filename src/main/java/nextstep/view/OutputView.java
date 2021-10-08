package nextstep.view;

import nextstep.domain.Car;
import nextstep.domain.Position;

import java.util.List;

public class OutputView {
    private static final String DISTANCE = "-";

    public void printRacingResult(List<Car> cars){
        System.out.println("실행결과");
        for (Car car : cars) {
            System.out.print(car.name()+" :");
            printCarDistance(car.position());
        }
    }

    public void printWinners(List<Car> cars) {
        String resultWinnerText = new String("최종 우승자는 ");
        resultWinnerText += getWinners(cars, resultWinnerText);
        resultWinnerText += "입니다.";
        System.out.println(resultWinnerText);
    }

    private String getWinners(List<Car> cars, String resultWinnerText) {
        for (Car car : cars) {
            resultWinnerText += car.name()+",";
        }
        if (cars.size() == 1) {
            resultWinnerText = resultWinnerText.replace(",","");
        }
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

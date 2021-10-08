package nextstep.domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    private final List<Car> cars;

    public Cars(String inputCarName) {
        this.cars = makeCars(inputCarName);
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findWinners() {
        List<Car> winners = new ArrayList<>();
        Position firstCarPosition = this.getFirstPosition();
        for (Car car : cars) {
            if (car.isWinner(firstCarPosition)) {
                winners.add(car);
            }
        }
        return winners;
    }

    public List<Car> cars() {
        return this.cars;
    }

    private List<Car> makeCars(String inputCarName) {
        String[] carNames = inputCarName.split(",");
        List<Car> carList = new ArrayList<>();
        for (String carName : carNames) {
            carList.add(new Car(carName));
        }
        return carList;
    }

    private Position getFirstPosition() {
        Position maxPosition = new Position();
        for (Car car : cars) {
            Position carPosition = car.position();
            if (carPosition.isBiggerThan(maxPosition)) {
                maxPosition = car.position();
            }
        }
        return maxPosition;
    }

}

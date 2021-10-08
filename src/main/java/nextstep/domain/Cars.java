package nextstep.domain;

import nextstep.exception.MyErrorCode;
import nextstep.exception.MyException;

import java.util.*;

public class Cars {
    private final List<Car> cars;

    public Cars() {
        this.cars = new ArrayList<>();
    }

    public Cars(String inputCarName) {
        this(makeCars(inputCarName));
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
        checkHasDuplicateNameOfCars();
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

    public boolean isReadyToGo() {
        return this.cars.size() > 0;
    }

    public void startRacing() {
        for (Car car : this.cars) {
            RandomDecimalNumber randomDecimalNumber = new RandomDecimalNumber();
            car.move(randomDecimalNumber);
        }
    }

    private void checkHasDuplicateNameOfCars() {
        Set<String> carNameList = new HashSet<>(carNames());
        if (!isSameSize(carNameList)) {
            throw new MyException(MyErrorCode.HAS_DUPLICATED_NAME);
        }
    }

    private boolean isSameSize(Set<String> carNameList) {
        return this.cars.size() == carNameList.size();
    }

    private List<String> carNames() {
        List<String> carNames = new ArrayList<>();
        for (Car car : cars) {
            carNames.add(car.name());
        }
        return carNames;
    }

    private static List<Car> makeCars(String inputCarName) {
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

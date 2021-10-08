package nextstep.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CarsTest {
    @Test
    @DisplayName("1명 우승자를 찾는 테스트")
    void findOneWinner() {
        Car tom = new Car(new Name("tom"), new Position(1));
        Car dog = new Car(new Name("dog"), new Position(2));
        Car joy = new Car(new Name("joy"), new Position(1));

        Cars cars = new Cars(Arrays.asList(tom, dog, joy));
        Assertions.assertThat(cars.findWinners()).contains(dog);
    }

    @Test
    @DisplayName("여러 우승자를 찾는 테스트")
    void findWinners() {
        Car tom = new Car(new Name("tom"), new Position(2));
        Car dog = new Car(new Name("dog"), new Position(2));
        Car joy = new Car(new Name("joy"), new Position(1));

        Cars cars = new Cars(Arrays.asList(tom, dog, joy));
        Assertions.assertThat(cars.findWinners()).contains(tom, dog);
    }
}

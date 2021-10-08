package nextstep.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(new Name("tom"), new Position(1));
    }

    @Test
    @DisplayName("차가 움직이는 테스트")
    void move() {
        car.move(() -> true);
        Assertions.assertThat(car.position()).isEqualTo(2);
    }

    @Test
    @DisplayName("차가 안움직이는 테스트")
    void stop() {
        car.move(() -> false);
        Assertions.assertThat(car.position()).isEqualTo(1);
    }
}

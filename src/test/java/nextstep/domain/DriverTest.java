package nextstep.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DriverTest {
    @Test
    @DisplayName("움직일수 있는지 판단하는 함수 테스트")
    public void movableTest() {
        Driver driver = new Driver();
        assertThat(driver.movable(5)).isTrue();
    }

    @Test
    @DisplayName("움직일수 없는지 판단하는 함수 테스트")
    public void notMovableTest() {
        Driver driver = new Driver();
        assertThat(driver.movable(1)).isFalse();
    }
}

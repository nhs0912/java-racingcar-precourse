package nextstep.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomDecimalNumberTest {

    @Test
    @DisplayName("move할수 있는 테스트")
    void movable() {
        RandomWay randomWay = () -> true;
        assertThat(randomWay.movable()).isTrue();
    }

    @Test
    @DisplayName("move할수 없는 테스트")
    void notMovable() {
        RandomWay randomWay = () -> false;
        assertThat(randomWay.movable()).isFalse();
    }
}

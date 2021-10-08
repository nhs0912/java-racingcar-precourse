package nextstep.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PositionTest {
    @Test
    @DisplayName("Position의 거리가 하나씩 증가하는지 확인하는 테스트")
    void move() {
        Position position = new Position(1);
        position.move();
        assertThat(position.distance()).isEqualTo(2);
    }
}

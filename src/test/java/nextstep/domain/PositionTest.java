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

    @Test
    @DisplayName("비교하는 Position이 더 클 때 테스트")
    void compareBigPosition() {
        Position position = new Position(2);
        assertThat(position.isBiggerThan(new Position(1))).isTrue();
    }

    @Test
    @DisplayName("비교하는 Position이 더 작을 때 테스트")
    void compareSmallPosition() {
        Position position = new Position(3);
        assertThat(position.isBiggerThan(new Position(4))).isFalse();
    }
}

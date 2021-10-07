package nextstep.domain;

import nextstep.exception.MyException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {
    @Test
    @DisplayName("자동차 이름이 5자를 넘었을 때 테스트")
    void moreThanFiveCarNameLength(){
        assertThatThrownBy(()-> {
            new Name("tomtom");
        }).isInstanceOf(MyException.class)
                .hasMessageContaining("이름은 5자 이하만 가능합니다.");
    }

    @Test
    @DisplayName("자동차 이름이 5자를 안넘었을 때 테스트")
    void lessThanFiveCarNameLength(){
        Name name = new Name("haha");
        assertThat(name.name()).isEqualTo("haha");
    }
}
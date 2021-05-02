package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    @Test
    @DisplayName("자동차 이동 여부 테스트")
    void isMove() {
        assertThat(Racing.isMove(3)).isEqualTo(CarStatus.STOP);
        assertThat(Racing.isMove(4)).isEqualTo(CarStatus.GO);
        assertThat(Racing.isMove(9)).isEqualTo(CarStatus.GO);
    }

    @Test
    @DisplayName("자동차 이동값 범위 테스트")
    void correctMoveCnt() {
        MoveNumber moveNumber = new MoveNumber();
        assertThat(0 <= moveNumber.getMoveNumber() && moveNumber.getMoveNumber() <= 9 ).isTrue();
    }
}

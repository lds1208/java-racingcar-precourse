package racingcar;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    @Test
    void MoveTest() {
        assertThat(Racing.isMove(3)).isEqualTo(CarStatus.STOP);
        assertThat(Racing.isMove(4)).isEqualTo(CarStatus.GO);
        assertThat(Racing.isMove(9)).isEqualTo(CarStatus.GO);
    }
}

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
    void correctMoveNumber() {
        MoveNumber moveNumber = new MoveNumber();
        int moveNum = moveNumber.getMoveNumber();
        assertThat(0 > moveNum ||  moveNum > 9 ).isFalse();
    }

    @Test
    @DisplayName("실제 경주 테스트")
    void race() {
        RacingCnt racingCnt = new RacingCnt(3);
        Cars cars = new Cars("1번차,2번차,3번차");
        Racing.startRacing(cars, racingCnt);
        assertThat(cars.getCars().get(0).getName()).isEqualTo("1번차");
        assertThat(cars.getCars().get(0).getMoveCnt() <= 3).isTrue();

        assertThat(cars.getCars().get(1).getName()).isEqualTo("2번차");
        assertThat(cars.getCars().get(1).getMoveCnt() <= 3).isTrue();

        assertThat(cars.getCars().get(2).getName()).isEqualTo("3번차");
        assertThat(cars.getCars().get(2).getMoveCnt() <= 3).isTrue();
    }
}

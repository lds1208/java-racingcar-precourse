package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingTest {
    @Test
    @DisplayName("자동차 이동 여부 테스트")
    void isMove() {
        assertThat(Racing.isMove(3)).isFalse();
        assertThat(Racing.isMove(4)).isTrue();
        assertThat(Racing.isMove(9)).isTrue();
    }

    @Test
    @DisplayName("자동차 이동값 범위 테스트")
    void correctMoveNumber() {
        MoveNumber moveNumber = new MoveNumber();
        int moveNum = moveNumber.getMoveNumber();
        assertThat(0 > moveNum || moveNum > 9).isFalse();
    }

    @Test
    @DisplayName("실제 경주 테스트")
    void race() {
        int testRacingCnt = 5;
        RacingCnt racingCnt = new RacingCnt(testRacingCnt);
        Cars cars = new Cars("1번차,2번차,3번차");
        Racing.startRacing(cars, racingCnt);

        List<Integer> carsMoveCnt = new ArrayList<Integer>();
        for (Car car : cars.getCars()) {
            assertThat(car.getMoveCnt() <= testRacingCnt).isTrue();
            carsMoveCnt.add(car.getMoveCnt());
        }
        int maxMoveCnt = Collections.max(carsMoveCnt);
        for (Car car : cars.getCars()) {
            assertThat(car.isWinner()).isEqualTo(maxMoveCnt == car.getMoveCnt());
        }
    }
}

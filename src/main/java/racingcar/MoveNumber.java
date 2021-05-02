package racingcar;

public class MoveNumber {
    private static final int MAX_MOVE_NUMBER = 9;

    public int getMoveNumber() {
        int moveNumber = (int) Math.floor((Math.random() * MAX_MOVE_NUMBER));
        validateMoveCnt(moveNumber);
        return moveNumber;
    }

    private void validateMoveCnt(int moveCnt) {
        if (moveCnt < 0 || moveCnt > 9) {
            throw new IllegalArgumentException("잘못된 이동난수가 발생 하였습니다.");
        }
    }
}

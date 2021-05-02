package racingcar;

public class Car {

    private String name;
    private int moveCnt;
    private boolean isWinner;

    public Car(String name) {
        validateName(name);
        this.name = name;
        this.moveCnt = 0;
    }

    public String getName() {
        return name;
    }

    public int getMoveCnt() {
        return moveCnt;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
    }

    public void go() {
        this.moveCnt += 1;
    }

    private void validateName(String name) {
        if ("".equals(name)) {
            throw new IllegalArgumentException("자동차의 이름을 입력 해주세요..");
        }
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이내로 입력 해주세요..");
        }
    }

}

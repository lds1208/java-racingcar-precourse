package racingcar;

public class RacingCnt {
    private static int racingCnt;

    public RacingCnt() {
        String racingCnt = "";
        try {
            racingCnt = Ui.getRacingCnt();
            this.racingCnt = Integer.parseInt(racingCnt);
        } catch (NumberFormatException nfe) {
            System.out.println("숫자만 입력 해주세요.");
            new RacingCnt();
        }
    }

    public RacingCnt(int racingCnt) {
        this.racingCnt = racingCnt;
    }

    public int getRacingCnt() {
        return racingCnt;
    }

}

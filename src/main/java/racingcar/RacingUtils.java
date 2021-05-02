package racingcar;


public class RacingUtils {

    public static Cars createCars() {
        try {
            Cars cars = new Cars(Ui.getCarNames());
            return cars;
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
            System.out.println();
            return createCars();
        }
    }

    public static RacingCnt getRacingCnt() {
        RacingCnt racingCnt = new RacingCnt();
        return racingCnt;
    }
}

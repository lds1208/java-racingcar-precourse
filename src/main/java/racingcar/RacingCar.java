package racingcar;

public class RacingCar {
    public static void main(String[] args) {
        startRacingCar();
    }

    private static void startRacingCar() {
        Cars cars = RacingUtils.createCars();
        RacingCnt racingCnt = RacingUtils.getRacingCnt();
    }
}

package racingcar;

public class Racing {

    public static CarStatus isMove(int moveNum) {
        if (moveNum >= 4) {
            return CarStatus.GO;
        }
        return CarStatus.STOP;
    }

    public static void startRacing(Cars cars, RacingCnt racingCnt) {
        Ui.printStartRacingMsg();
        for (int i = 0; i < racingCnt.getRacingCnt(); i++) {
            Racing.moveCars(cars);
            System.out.println();
        }
    }

    private static void moveCars(Cars cars) {
        MoveNumber moveNumber = new MoveNumber();
        for (Car car : cars.getCars()) {
            moveCar(car, moveNumber);
            Ui.printCurrentCarLocation(car);
        }
    }

    private static void moveCar(Car car, MoveNumber moveNumber) {
        int moveNum = moveNumber.getMoveNumber();
        if (isMove(moveNum) == CarStatus.GO) {
            car.go();
        }
    }

}

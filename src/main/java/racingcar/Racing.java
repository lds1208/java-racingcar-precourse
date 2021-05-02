package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Racing {

    public static boolean isMove(int moveNum) {
        return moveNum >= 4;
    }

    public static void startRacing(Cars cars, RacingCnt racingCnt) {
        Ui.printStartRacingMsg();
        for (int i = 0; i < racingCnt.getRacingCnt(); i++) {
            moveCars(cars);
            System.out.println();
        }
        setRacingWinner(cars);
        Ui.printEndGameMsg(getWinnersName(cars));
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
        if (isMove(moveNum)) {
            car.go();
        }
    }

    private static void setRacingWinner(Cars cars) {
        int winnerMoveCnt = getWinnerMoveCnt(cars);
        for (Car car : cars.getCars()) {
            car.setWinner(car.getMoveCnt() == winnerMoveCnt);
        }
    }

    private static int getWinnerMoveCnt(Cars cars) {
        int winnerMoveCnt = 0;
        for (Car car : cars.getCars()) {
            winnerMoveCnt = Math.max(winnerMoveCnt, car.getMoveCnt());
        }
        return winnerMoveCnt;
    }

    public static String getWinnersName(Cars cars) {
        List<String> winnersName = new ArrayList<String>();
        for (Car car : cars.getCars()) {
            winnersName = createWinnersNameList(winnersName, car);
        }
        return String.join(",", winnersName);
    }

    private static List<String> createWinnersNameList(List<String> winnersName, Car car) {
        if (car.isWinner()) {
            winnersName.add(car.getName());
        }
        return winnersName;
    }

}

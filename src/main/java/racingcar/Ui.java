package racingcar;

import java.util.Scanner;

public class Ui {

    private static Scanner sc = new Scanner(System.in);

    public static String getCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = sc.next();
        return carNames;
    }

    public static String getRacingCnt() {
        System.out.println("시도할 회수는 몇회인가요?");
        String racingCnt = sc.next();
        return racingCnt;
    }

    public static void printStartRacingMsg() {
        System.out.println("실행 결과");
    }

    public static void printCurrentCarLocation(Car car) {
        String carName = car.getName();
        int carMoveCnt = car.getMoveCnt();
        System.out.print(carName+": ");
        for(int i=0; i < carMoveCnt ; i++){
            System.out.print("-");
        }
        System.out.println();
    }
}


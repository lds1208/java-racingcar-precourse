package racingcar;

public class Racing {

    public static CarStatus isMove(int moveNum) {
        if (moveNum >= 4){
            return CarStatus.GO;
        }
        return CarStatus.STOP;
    }

}

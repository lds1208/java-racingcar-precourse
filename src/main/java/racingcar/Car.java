package racingcar;

public class Car {

    private String name;
    private CarStatus carStatus;
    private int moveCnt;

    public Car(String name) {
        validateName(name);
        this.name = name;
        this.carStatus = CarStatus.READY;
        this.moveCnt = 0;
    }

    private void validateName(String name) {
        System.out.println("name : ["+name+"]");
        if ( "".equals(name) ){
            throw new IllegalArgumentException("자동차의 이름을 입력 해주세요..");
        }
        if ( name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5글자 이내로 입력 해주세요..");
        }
    }

}

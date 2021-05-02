package racingcar;

import java.util.ArrayList;
import java.util.List;

public class Cars {
    List<Car> cars;

    public Cars(String carsName) {
        List<Car> cars = new ArrayList<Car>();
        for (String carName : carsName.split(",")) {
            cars.add(new Car(carName));
        }
        validateSize(cars);
        this.cars = cars;
    }

    private void validateSize(List<Car> cars) {
        if (cars.size() < 2) {
            throw new IllegalArgumentException("경주할 자동차를 2대 이상 입력 해주세요..");
        }
    }


}

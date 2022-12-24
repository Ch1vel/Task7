package web.implement;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDAOImpl implements CarDAOImplInt{
    private List<Car> cars = new ArrayList<>();


    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getListOfCars() {
        return cars;
    }
}

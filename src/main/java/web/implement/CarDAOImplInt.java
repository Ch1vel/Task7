package web.implement;

import web.model.Car;

import java.util.List;

public interface CarDAOImplInt {
    void add(Car car);
    List<Car> getListOfCars();
}

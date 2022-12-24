package web.service;

import web.model.Car;

import java.util.List;

public interface CarServiceInt {
    void add(Car car);
    List<Car> getListOfCars();
}

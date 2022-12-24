package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.implement.CarDAOImplInt;
import web.model.Car;

import java.util.List;
@Service
public class CarService implements CarServiceInt{
    @Autowired
    private CarDAOImplInt carDAOImplInt;

    @Override
    public void add(Car car) {
        carDAOImplInt.add(car);
    }

    @Override
    public List<Car> getListOfCars() {
        return carDAOImplInt.getListOfCars();
    }
}

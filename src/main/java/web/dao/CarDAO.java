package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDAO implements CarDAOImplInt{
    private List<Car> cars = new ArrayList<>();
    {
        cars.add(new Car("Hyndai", 1293, "2016"));
        cars.add(new Car("Gaz", 1293565, "1985")) ;
        cars.add(new Car("Reno", 12932454, "2019"));
        cars.add(new Car("Mersedes", 129354, "2011"));
        cars.add(new Car("Hino", 129312, "2015"));
        cars.add(new Car("Volvo", 12392, "2013"));
    }

    @Override
    public void add(Car car) {
        cars.add(car);
    }

    @Override
    public List<Car> getListOfCars() {
        return cars;
    }
}

package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceInt;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class HelloController {
    Car car1 = new Car("Hyndai", 1293, "2016");
    Car car2 = new Car("Gaz", 1293565, "1985");
    Car car3 = new Car("Reno", 12932454, "2019");
    Car car4 = new Car("Mersedes", 129354, "2011");
    Car car5 = new Car("Hino", 129312, "2015");
    Car car6 = new Car("Volvo", 12392, "2013");
    @Autowired
    private CarServiceInt carServiceInt;


    @GetMapping(value = "")
    public String carsWithCount(@RequestParam(value = "count", required = false, defaultValue = "5") String count, ModelMap model) {
        carServiceInt.add(car1);
        carServiceInt.add(car2);
        carServiceInt.add(car3);
        carServiceInt.add(car4);
        carServiceInt.add(car5);
        carServiceInt.add(car6);
        if (Integer.valueOf(count) <= 0) {
            model.addAttribute("messages", "Недопустимое значение count");
        } else if (Integer.valueOf(count) > 0 && Integer.valueOf(count) < 5) {
            List<Car> messages = carServiceInt.getListOfCars().subList(0, Integer.valueOf(count));
            model.addAttribute("messages", messages);
        } else {
            List<Car> messages = carServiceInt.getListOfCars();
            model.addAttribute("messages", messages);
        }
        return "index";
    }

}
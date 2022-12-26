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
public class CarController {

    @Autowired
    private CarServiceInt carServiceInt;

    @GetMapping(value = "")
    public String carsWithCount(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap model) {
        if (count > 0 && count < 5) {
            List<Car> messages = carServiceInt.getListOfCars().subList(0, count);
            model.addAttribute("messages", messages);
        } else if( count >= 5 ) {
            List<Car> messages = carServiceInt.getListOfCars();
            model.addAttribute("messages", messages);
        }
        return "index";
    }

}
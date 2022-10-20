package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.services.CarService;
import web.services.CarServiceImpl;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String printCars(@RequestParam(required = false) Integer count, ModelMap model) {
        if (count != null) {
            model.addAttribute("content", carService.getListByNumbersOfCars(count));
        } else {
            model.addAttribute("content", carService.getAllCars());
        }



        return "cars";
    }
}

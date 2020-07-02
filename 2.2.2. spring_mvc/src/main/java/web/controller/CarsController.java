package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "locale", required = false) String name, ModelMap model) {
        model.addAttribute("cars", CarService.getCarList());
        if ("ru".equals(name)) {
            model.addAttribute("locale", "Машины:");
        } else {
            model.addAttribute("locale", "Cars:");
        }
        return "cars";
    }
}

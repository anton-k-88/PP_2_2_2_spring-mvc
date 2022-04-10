package web.controller;

import Service.ListCarService;
import model.Car;
import model.CarColor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class CarController {
    private List<Car> list;

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", required = false) Integer qty, Model model) {
        ListCarService listCarService = new ListCarService();
        model.addAttribute("carsList", listCarService.getCarsList(qty));
        return "cars";
    }
}



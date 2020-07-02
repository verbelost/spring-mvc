package web.service;

import web.Models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public static List<Car> getCarList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Tesla", "red", 493499));
        list.add(new Car("Audi", "black", 793189));
        list.add(new Car("BMV", "silver", 344734));
        return list;
    }
}

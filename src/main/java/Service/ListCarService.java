package Service;

import model.Car;
import model.CarColor;

import java.util.ArrayList;
import java.util.List;

public class ListCarService {
    private List<Car> list;

    {
        list = new ArrayList<>();
        list.add(Car.addCar("BMW", "3", CarColor.BLACK));
        list.add(Car.addCar("Mini", "Cooper S", CarColor.BLUE));
        list.add(Car.addCar("Citroen", "DS4", CarColor.WHILE));
        list.add(Car.addCar("OPEL", "Astra", CarColor.RED));
        list.add(Car.addCar("TAZ", "2107", CarColor.GREEN));
    }

    public List<Car> getCarsList(Integer qty) {
        if (qty == null || qty > 4) {
            return list;
        } else {
            return list.stream().limit(qty).toList();
        }
    }
}
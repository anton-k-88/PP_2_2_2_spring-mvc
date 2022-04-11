package Service;

import model.Car;
import model.CarColor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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
        Collections.shuffle(list);
        if (qty == null || qty >= list.size()) {
            return list;
        } else {
            return list.stream().limit(qty).collect(Collectors.toList());
        }
    }
}
package web.services;

import web.models.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarServiceImpl implements CarService{

   private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Mercedes-Benz E-Класс AMG 63 AMG S V (W213)", "Germany", 70000));
        cars.add(new Car("Бибика", "China", 5));
        cars.add(new Car("Гольф-кар", "United Kingdom", 9000));
        cars.add(new Car("БЕЛАЗ", "Belarus", 150000));
        cars.add(new Car("Газель", "Russia", 30000));
    }
    @Override
    public List<Car> getListByNumbersOfCars(int amount) {
        if (amount >= 5) return cars;
        List<Car> newListOfCars = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            newListOfCars.add(cars.get(i));
        }
        return newListOfCars;
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}

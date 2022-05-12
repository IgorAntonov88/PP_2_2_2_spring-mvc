package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private static List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("BMW",323,2005));
        cars.add(new Car("BMW",325,2007));
        cars.add(new Car("AUDI",6,2000));
        cars.add(new Car("AUDI",8,2004));
        cars.add(new Car("Mercedes",120,1998));
    }

    @Override
    public List<Car> getCar(int count) {
        if (count > 0 && count < 5) {
            return cars.
                    stream().
                    limit(count).
                    collect(Collectors.toList());
        }
        return cars;
    }
}

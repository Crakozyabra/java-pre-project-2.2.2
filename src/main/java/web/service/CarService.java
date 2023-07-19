package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CarService {

    private List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>() {{
            add(new Car("Model1", 100, LocalDate.of(2019, Month.JANUARY, 1)));
            add(new Car("Model2", 200, LocalDate.of(2020, Month.FEBRUARY, 2)));
            add(new Car("Model3", 300, LocalDate.of(2021, Month.MARCH, 3)));
            add(new Car("Model4", 400, LocalDate.of(2022, Month.APRIL, 4)));
            add(new Car("Model5", 500, LocalDate.of(2023, Month.MAY, 5)));
        }};
    }

    public List<Car> getAllByCount(Integer count) {
        return cars.subList(0, (Objects.isNull(count) || count > cars.size() || count < 0) ? cars.size() : count);
    }
}
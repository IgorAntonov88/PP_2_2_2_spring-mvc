package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

	@GetMapping(value = "/cars")
	public String printCars(@RequestParam(defaultValue = "5", required = false) int count, ModelMap model) {

		List<Car> cars = new ArrayList<>();
		cars.add(new Car("BMW",323,2005));
		cars.add(new Car("BMW",325,2007));
		cars.add(new Car("AUDI",6,2000));
		cars.add(new Car("AUDI",8,2004));
		cars.add(new Car("Mercedes",120,1998));
		model.addAttribute("cars", cars);
		return "cars";
	}
}
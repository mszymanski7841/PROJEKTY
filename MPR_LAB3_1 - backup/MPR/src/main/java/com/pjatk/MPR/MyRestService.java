package com.pjatk.MPR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MyRestService {
    private CarRepository repository;

    @Autowired
    public MyRestService(CarRepository repository) {
        this.repository = repository;
        this.repository.save(new Car("Mazda", "RX-7", 2004));
        this.repository.save(new Car("BMW", "E36", 2001));
        this.repository.save(new Car("BMW", "E90", 2009));
        this.repository.save(new Car("Mazda 2", "RX-7", 2004));
    }

//    public Optional<Car> findCarByMake(String make) {
//        Optional<Car> repoCar = this.repository.findByMake(make);
//        if (repoCar.isPresent()) {
//            return repoCar;
//        } else {
//            throw new CarNotFoundException();
//        }
//    }

    public List<Car> findAll() {
        return (List<Car>) this.repository.findAll();
    }

    public Optional<Car> findById(Long id) {
        Optional<Car> repoCar = this.repository.findById(id);
        if (repoCar.isPresent()) {
            return repoCar;
        } else {
            throw new CarNotFoundException();
        }
    }

    public void addCar(Car car) {
        if (repository.existsById(car.getId())) {
            throw new CarAlreadyExistsException();
        } else {
            this.repository.save(car);
        }
    }
    public List<Car> findByMake(String make){
        List<Car> sameMake = this.repository.findByMake(make);
        List<Car> cars = this.repository.findAll();
        for(Car car: cars){
            if(car.getMake().equalsIgnoreCase(make)){
                sameMake.add(car);
            }
        }
        return this.repository.findByMake(make);
    }
    public List<String> filterByMake(String make){
        return this.repository.findAll().stream().filter(car -> car.getMake().contains(make)).map(Car::getMake).collect(Collectors.toList());
    }
}

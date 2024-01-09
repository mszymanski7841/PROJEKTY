package com.pjatk.MPR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MyRestService {

    RestClient restClient;

//    @Autowired
    public MyRestService() {
        restClient = RestClient.create();
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
        List<Car> cars = restClient
                .get()
                .uri("http://localhost:8080/all")
                .retrieve()
                .body(new ParameterizedTypeReference<>(){}); //<-- jesli wiecej obiektow
        //.body(car.class) <-- jesli jeden obiekt
        return cars;
    }

//    public Optional<Car> findById(Long id) {
//        Optional<Car> repoCar = this.repository.findById(id);
//        if (repoCar.isPresent()) {
//            return repoCar;
//        } else {
//            throw new CarNotFoundException();
//        }
//    }
//
//    public void addCar(Car car) {
//        if (repository.existsById(car.getId())) {
//            throw new CarAlreadyExistsException();
//        } else {
//            this.repository.save(car);
//        }
//    }
//    public List<Car> findByMake(String make){
//        List<Car> sameMake = this.repository.findByMake(make);
//        List<Car> cars = this.repository.findAll();
//        for(Car car: cars){
//            if(car.getMake().equalsIgnoreCase(make)){
//                sameMake.add(car);
//            }
//        }
//        return this.repository.findByMake(make);
//    }
//    public List<String> filterByMake(String make){
//        return this.repository.findAll().stream().filter(car -> car.getMake().contains(make)).map(Car::getMake).collect(Collectors.toList());
//    }
}

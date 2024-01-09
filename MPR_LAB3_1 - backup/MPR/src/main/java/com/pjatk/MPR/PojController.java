package com.pjatk.MPR;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class PojController {

    private MyRestService service;

    @Autowired
    public PojController(MyRestService service) {
        this.service = service;
    }

    @GetMapping("car/get/{id}")
    public Optional<Car> getById(
            @PathVariable("id") Long id
    ) {
        return this.service.findById(id);
    }

//    @GetMapping("car/get/make/{make}")
//    public Car getByMake(
//            @PathVariable("make") String make
//    ){
//        return service.findCarByMake(make);
//    }

    @GetMapping("car/get/all")
    public List<Car> getByMake() {
        return service.findAll();
    }


    @PostMapping("car/post/add")
    public void addCar(@RequestBody Car car) {
        this.service.addCar(car);
    }

    @GetMapping("car/get/findByMake/{make}")
    public List<Car> findByMake(@PathVariable("make") String make){
        return this.service.findByMake(make);
    }
    @GetMapping("car/get/filterByMake/{make}")
    public List<String> filterByMake(@PathVariable("make") String make){
        return this.service.filterByMake(make);
    }

}

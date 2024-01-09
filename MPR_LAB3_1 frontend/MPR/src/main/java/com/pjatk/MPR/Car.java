package com.pjatk.MPR;

//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

public class Car {
    private Long id;
    private String make;
    private String model;
    private int age;

    protected Car() {
    }

    public Car(String make, String model, int age) {
        this.make = make;
        this.model = model;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAge(int year) {
        this.age = year;
    }
}

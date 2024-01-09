package com.pjatk.MPR;

public class CarAlreadyExistsException extends RuntimeException {
    public CarAlreadyExistsException(){
        super("This car already exists!");
    }
}

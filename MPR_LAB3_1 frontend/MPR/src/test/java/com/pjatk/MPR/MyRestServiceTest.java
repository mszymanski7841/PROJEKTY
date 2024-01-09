//package com.pjatk.MPR;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.*;
//
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//public class MyRestServiceTest {
//    @Mock
//    private CarRepository repository;
//    private AutoCloseable openMocks;
//    private MyRestService myRestService;
//
//    @BeforeEach
//    public void init() {
//        openMocks = MockitoAnnotations.openMocks(this);
//        myRestService = new MyRestService(repository);
//    }
//
//    @AfterEach
//    public void close() throws Exception {
//        openMocks.close();
//    }
//
////    @Test
////    public void testFindCarByMake() {
////        String make = "make";
////        Car car = new Car("make", "model", 0);
////        when(repository.findByMake(make)).thenReturn(car);
////        Car result = myRestService.findCarByMake(make);
////        assertEquals(car, result);
////    }
//
//    @Test
//    public void testAddCar() {
//        String make = "make";
//        String model = "model";
//        int age = 0;
//        Car car = new Car(make, model, age);
//        ArgumentCaptor<Car> captor = ArgumentCaptor.forClass(Car.class);
//        when(repository.save(captor.capture())).thenReturn(car);
//        myRestService.addCar(car);
//        verify(repository, Mockito.times(1)).save(Mockito.any());
//        Car carFromSaveCall = captor.getValue();
//        assertEquals(car, carFromSaveCall);
//    }
//
//    @InjectMocks
//    MyRestService service;
//
//    @Test
//    public void carAddAddsCarWhenCarIsNotPresent() {
//        Car car = new Car("Fiat", "Panda", 2000);
//        car.setId(2L);
//        when(repository.findById(2L)).thenReturn(Optional.empty());
//        service.addCar(car);
//        verify(repository).save(car);
//    }
//
//    @Test
//    public void carAddThrowsExceptionWhenCarIsPresent() {
//        Car car = new Car("Fiat", "Panda", 2000);
//        car.setId(2L);
//        when(repository.findById(2L)).thenReturn(Optional.of(car));
//        assertThrows(CarAlreadyExistsException.class, () -> {
//            service.addCar(car);
//        });
//    }
//
//    @Test
//    public void carFilterByMakeThrowsExceptionWhenCarIsNotPresent(){
//
//    }
//}

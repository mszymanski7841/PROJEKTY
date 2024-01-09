//package com.pjatk.MPR;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import java.util.Optional;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.doThrow;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@ExtendWith(MockitoExtension.class)
//public class PojControllerTest {
//    private MockMvc mockMvc;
//    //    private CarRepository repository;
////    private AutoCloseable openMocks;
//    @InjectMocks
//    private PojController controller;
//    @Mock
//    private MyRestService service;
//
//    @BeforeEach
//    public void setup() {
//        this.mockMvc = MockMvcBuilders.standaloneSetup(new CarExceptionHandler(), controller).build();
//    }
//
//    @Test
//    public void getByIdReturns200WhenCarIsPresent() throws Exception {
//        Car car = new Car("Fiat", "Panda", 2000);
//        when(service.findById(3L)).thenReturn(Optional.of(car));
//
//        mockMvc.perform(MockMvcRequestBuilders.get("car/get/3"))
//                .andExpect(MockMvcResultMatchers.jsonPath("$.age").value(2000))
//                .andExpect(jsonPath("$.name").value("Fiat"))
//                .andExpect(status().isOk());
//    }
//    @Test
//    public void check400IsReturnedWhenCarIsAlreadyThere() throws Exception{
//        Car car = new Car ("Mazda", "RX-7", 2004);
//        doThrow(new CarAlreadyExistsException()).when(service).addCar(any());
//
//        mockMvc.perform(post("car/add")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content("{\"make\": \"Pagani\", \"model\": \"Zonda\", \"age\": 2009 }")
//                .accept(MediaType.APPLICATION_JSON))
//                .andExpect(status().isBadRequest());
//    }
//
//
////    @BeforeEach
////    public void init(){
////        openMocks = MockitoAnnotations.openMocks(this);
////        pojController = new PojController(myRestService);
////    }
////    @AfterEach
////    public void close() throws Exception {
////        openMocks.close();
////    }
////    @Test
////    public void testGetById() {
////        Long id = 0L;
////        pojController.getById(id);
////    }
//}

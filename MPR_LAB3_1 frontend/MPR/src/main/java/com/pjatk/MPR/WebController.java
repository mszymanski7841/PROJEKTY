package com.pjatk.MPR;

import com.pjatk.MPR.MyRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class WebController {

    @GetMapping(value = "/welcome")
    public String getWelcomeView() {return "welcome";}

    private final MyRestService service;

    @Autowired
    public  WebController(MyRestService carService) {this.service = carService;}


    @GetMapping(value = "/index")
    public String getIndexView(Model model) {
        model.addAttribute("car", service.findAll());
        return "index";
    }

    @GetMapping(value = "/addCar")
    public String getAddView(Model model){
        model.addAttribute("car", new Car("","",0));
        return "addCar";
    }

    @PostMapping(value = "/addCar")
    public String addCar(Car car, Model model, RedirectAttributes redirectAttributes){
        if(car.getMake().isEmpty() || car.getModel().isEmpty()){
            model.addAttribute("errorMessage", "Make and/or model can't be empty");
            return "addCar";
        }
        service.addCar;
        redirectAttributes.addFlashAttribute("SuccessMessage", "Car added");
        return "redirect:/index";
    }

    @GetMapping(value = "/editCar/{id}")
    public String getEditView(@PathVariable("id") Long id, Model model){
        Optional<Car> car = service.findById(id);
        if(car.isPresent()){
            model.addAttribute("car",car.get());
            return "editCar";
        } else {
            return "redirect:/index";
        }
    }

    @PostMapping(value = "/editCar")
    public String editCar(Car car, Model model,RedirectAttributes redirectAttributes){
        if (car.getMake().isEmpty() || car.getModel().isEmpty()) {
            model.addAttribute("errorMessage", "Make and/or make can't be empty");
            return "editCar";
        }
        service.replaceCar(car, car.getId());
        redirectAttributes.addFlashAttribute("SuccessMessage", "Car edited successfully");
        return "redirect:/index";
    }
    @GetMapping(value = "/deleteCar/{id}")
    public String deleteCar(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        try {
            service.deleteCar(id);
            redirectAttributes.addFlashAttribute("successMessage", "Car deleted successfully");
        } catch (CarNotFoundException e) {
            redirectAttributes.addFlashAttribute("errorMessage", "Car not found");
        }
        return "redirect:/index";
    }
}
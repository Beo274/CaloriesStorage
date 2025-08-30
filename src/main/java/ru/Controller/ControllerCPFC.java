package ru.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.Basket;
import ru.Service.ServiceCPFC;
import ru.nutrition.DTO.BasketDTO;
import ru.nutrition.Entity.Food;
import ru.nutrition.Entity.Vegetable;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/basket")
public class ControllerCPFC {
    @Autowired
    private ServiceCPFC serviceCPFC;

    @GetMapping
    public BasketDTO getBascket() {
        log.info("company get");
        return BasketDTO.from(serviceCPFC.getBasket());
    }

    @PostMapping("/add-food")
    public ResponseEntity addFood(@RequestBody Food food) {
        log.info("add food");
        serviceCPFC.addFood(food);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/del-food/{id}")
    public ResponseEntity delFood(@PathVariable int id) {
        log.info("del food with id = {}", id);
        serviceCPFC.removeFood(id);
        return ResponseEntity.ok().build();
    }

//    @PostMapping("/veg")
//    public ResponseEntity addVegFood(@RequestBody Vegetable food) {
//        log.info("add vegetable");
//        basket.getMeal().add(food);
//        return ResponseEntity.ok().build();
//    }
}

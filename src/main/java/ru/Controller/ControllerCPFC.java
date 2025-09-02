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

    @PostMapping
    public int createBasket(@RequestBody BasketDTO basketDTO) {
        log.info("create basket");
        return serviceCPFC.createBasket(basketDTO.toBasket());
    }

    @GetMapping("/{id}")
    public BasketDTO getBascket(@PathVariable int id) {
        log.info("basket get with id: {}", id);
        return BasketDTO.from(serviceCPFC.getBasket(id));
    }

    @PostMapping("/{id}/add-food")
    public ResponseEntity addFood(@RequestBody Food food, @PathVariable(name = "id") int basket_id) {
        log.info("add food");
        serviceCPFC.addFood(food, basket_id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/del-food")
    public String delFood(@RequestParam(name = "name") String food_name) {
        log.info("del food with name = {}", food_name);
        serviceCPFC.removeFood(food_name);
        return "Deleted food with name = " + food_name;
    }
}

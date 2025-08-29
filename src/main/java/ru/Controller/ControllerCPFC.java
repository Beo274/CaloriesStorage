package ru.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.Basket;
import ru.Service.ServiceCPFC;
import ru.nutrition.Entity.Food;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/food")
public class ControllerCPFC {
    @Autowired
    private Basket basket;

    @GetMapping
    public Basket getBascket() {
        log.info("company get");
        return basket;
    }

    @PostMapping("/add")
    public ResponseEntity addFood(@RequestBody Food food) {
        log.info("add food");
        basket.getFood().add(food);
        return ResponseEntity.ok().build();
    }
}

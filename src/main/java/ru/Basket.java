package ru;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.nutrition.Entity.Food;

import java.util.List;

@Data
public class Basket extends MealManager<Food> {
    private String basketName;

    public Basket(@Qualifier("BasketName") String basketName) {
        this.basketName = basketName;
    }

//    public void whatsIn() {
//        getFood().forEach(System.out::println);
//    }

}

package ru.nutrition.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.Basket;
import ru.nutrition.Entity.Food;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasketDTO {
    private String name;
    private List<FoodDTO> meal;

    public static BasketDTO from(Basket basket) {
        // From basket to DTO
        BasketDTO basketDTO = new BasketDTO();
        basketDTO.setName(basket.getBasketName());
        List<FoodDTO> foodList = basket.getMeal().stream()
                .map(FoodDTO::from)
                .collect(Collectors.toList());
        basketDTO.setMeal(foodList);
        return basketDTO;
    }

    public Basket toBasket() {
        Basket basket = new Basket();
        basket.setBasketName(name);
        List<Food> meal = this.meal.stream()
                .map(FoodDTO::toFood).toList();
        return basket;
    }
}

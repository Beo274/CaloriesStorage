package ru.nutrition.DTO;

import lombok.Data;
import ru.nutrition.Entity.Food;

@Data
public class FoodDTO {
    private String name;
    private int calories;
    private double proteins;
    private double fats;
    private double carbohydrates;
    private int mass;

    public static FoodDTO from(Food food) {
        FoodDTO foodDTO = new FoodDTO();
        foodDTO.setName(food.getName());
        foodDTO.setCalories(food.getCalories());
        foodDTO.setProteins(food.getProteins());
        foodDTO.setFats(food.getFats());
        foodDTO.setCarbohydrates(food.getCarbohydrates());
        foodDTO.setMass(food.getMass());
        return foodDTO;
    }

    public Food toFood() {
        Food food = new Food();
        food.setName(this.name);
        food.setCalories(this.calories);
        food.setProteins(this.proteins);
        food.setFats(this.fats);
        food.setCarbohydrates(this.carbohydrates);
        food.setMass(this.mass);
        return food;
    }
}

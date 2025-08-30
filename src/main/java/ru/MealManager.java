package ru;

import lombok.Data;
import ru.nutrition.Entity.Food;

import java.util.ArrayList;
import java.util.List;

@Data
public class MealManager<T extends Food> {
    protected List<T> meal;

    public MealManager() {
        this.meal = new ArrayList<T>();
    }

    public List<T> getMeal() {
        return meal;
    }
}

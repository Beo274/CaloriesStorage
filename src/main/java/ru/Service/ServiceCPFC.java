package ru.Service;

import ru.nutrition.Entity.Food;

import java.util.List;

public interface ServiceCPFC {
    List<Food> getFood();
    void addFood(Food food);
}

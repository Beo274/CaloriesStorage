package ru.Service;

import ru.Basket;
import ru.nutrition.Entity.Food;

import java.util.List;

public interface ServiceCPFC {
    Basket getBasket();
    void addFood(Food food);
    void removeFood(int id);
}

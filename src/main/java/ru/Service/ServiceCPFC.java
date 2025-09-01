package ru.Service;

import ru.Basket;
import ru.nutrition.Entity.Food;

import java.util.List;

public interface ServiceCPFC {
    int createBasket(Basket basket);
    Basket getBasket(int basket_id);
    void addFood(Food food, int id);
    void removeFood(String food_name);
}

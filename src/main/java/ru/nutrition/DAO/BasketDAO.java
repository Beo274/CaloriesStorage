package ru.nutrition.DAO;

import ru.Basket;
import ru.nutrition.Entity.Food;

public interface BasketDAO {
    public int createBasket(Basket basket);
    public Basket getBasket(int basket_id);
    public void addFood(Food food, int basket_id);
    public void removeFood(String food_name);
}

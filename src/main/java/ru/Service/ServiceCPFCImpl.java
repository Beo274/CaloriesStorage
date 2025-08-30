package ru.nutrition.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.Basket;
import ru.Service.ServiceCPFC;
import ru.nutrition.Entity.Food;

import java.util.List;

@Service
public class ServiceCPFCImpl implements ServiceCPFC {

    @Autowired
    private Basket basket;


    @Override
    public Basket getBasket() {
        return basket;
    }

    @Override
    public void addFood(Food food) {
        basket.getMeal().add(food);
    }

    @Override
    public void removeFood(int id) {
        basket.getMeal().remove(id);
    }
}

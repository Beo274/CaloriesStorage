package ru.nutrition.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.Basket;
import ru.DAO.BasketDAO;
import ru.Service.ServiceCPFC;
import ru.nutrition.Entity.Food;

import java.util.List;

@Service
public class ServiceCPFCImpl implements ServiceCPFC {

    @Autowired
    private BasketDAO basketDAO;

    @Override
    @Transactional
    public int createBasket(Basket basket) {
        return basketDAO.createBasket(basket);
    }

    @Override
    public Basket getBasket(int basket_id) {
        return basketDAO.getBasket(basket_id);
    }

    @Override
    @Transactional
    public void addFood(Food food, int basket_id) {
        basketDAO.addFood(food, basket_id);
    }

    @Override
    @Transactional
    public void removeFood(String food_name) {
        basketDAO.removeFood(food_name);
    }
}

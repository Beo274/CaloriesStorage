package ru.nutrition.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.Basket;
import ru.Service.ServiceCPFC;
import ru.nutrition.Entity.Food;

import java.util.List;

@Service
public class ServiceCPFCImpl implements ServiceCPFC {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private Basket basket;
    @Autowired
    private Basket getBasket;

    @Override
    @Transactional
    public int createBasket(Basket basket) {
        entityManager.persist(basket);
        entityManager.flush();
        return basket.getId();
    }

    @Override
    public Basket getBasket(int basket_id) {
        return entityManager.find(Basket.class, basket_id);
    }

    @Override
    @Transactional
    public void addFood(Food food, int basket_id) {
        food.setBasket(getBasket(basket_id));
        entityManager.persist(food);
    }

    @Override
    @Transactional
    public void removeFood(int food_id, int basket_id) {
        basket.getMeal().remove(food_id);
    }
}

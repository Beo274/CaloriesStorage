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

    @Override
    @Transactional
    public Basket getBasket() {
        List<Food> food = entityManager.createQuery("SELECT f FROM Food f", Food.class).getResultList();
        basket.setMeal(food);
        return basket;
    }

    @Override
    @Transactional
    public void addFood(Food food) {
        entityManager.persist(food);
    }

    @Override
    @Transactional
    public void removeFood(int id) {
        basket.getMeal().remove(id);
    }
}

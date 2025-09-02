package ru.nutrition.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.Basket;
import ru.nutrition.Entity.Food;

@Repository
public class BasketDAOImpl implements BasketDAO {
    @Override
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
    public void addFood(Food food, int basket_id) {
        food.setBasket(getBasket(basket_id));
        entityManager.persist(food);
    }

    @Override
    public void removeFood(String food_name) {
        Food food = entityManager.createQuery("SELECT f FROM Food f WHERE name = :food_name", Food.class).setParameter("food_name", food_name).getSingleResult();
        entityManager.remove(food);
    }

    @PersistenceContext
    private EntityManager entityManager;

}

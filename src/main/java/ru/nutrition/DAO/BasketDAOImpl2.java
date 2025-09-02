package ru.nutrition.DAO;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import ru.Basket;
import ru.nutrition.DAO.repository.BasketRepository;
import ru.nutrition.DAO.repository.FoodRepository;
import ru.nutrition.Entity.Food;

@Repository
@Primary
@Slf4j
public class BasketDAOImpl2 implements BasketDAO {
    @Autowired
    private BasketRepository basketRepository;

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public int createBasket(Basket basket) {
        log.info("create basket with repository");
        return basketRepository.save(basket).getId();
    }

    @Override
    public Basket getBasket(int basket_id) {
        log.info("get basket with repository");
        return basketRepository.readBasketById(basket_id);
    }

    @Override
    public void addFood(Food food, int basket_id) {
        log.info("add food with repository");
        food.setBasket(getBasket(basket_id));
        foodRepository.save(food);
    }

    @Override
    public void removeFood(String food_name) {
        log.info("del food with repository");
        foodRepository.deleteFoodByName(food_name);
    }
}

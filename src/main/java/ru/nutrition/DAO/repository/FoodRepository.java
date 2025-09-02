package ru.nutrition.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import ru.nutrition.Entity.Food;

public interface FoodRepository extends CrudRepository<Food, Integer> {
    void deleteFoodByName(String name);
}

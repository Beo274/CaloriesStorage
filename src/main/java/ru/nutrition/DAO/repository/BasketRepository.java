package ru.nutrition.DAO.repository;

import org.springframework.data.repository.CrudRepository;
import ru.Basket;

public interface BasketRepository extends CrudRepository<Basket, Integer> {
    public Basket readBasketById(int id);
}

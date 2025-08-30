package ru;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import ru.nutrition.Entity.Food;

@Data
@Entity
@Table(name = "baskets")
public class Basket extends MealManager<Food> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "basketName")
    private String basketName;

    public Basket() {}

    public Basket(@Qualifier("BasketName") String basketName) { this.basketName = basketName; }

//    public void whatsIn() {
//        getFood().forEach(System.out::println);
//    }

}

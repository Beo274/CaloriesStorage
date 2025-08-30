package ru.nutrition.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "counter")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "calories")
    private int calories;

    @Column(name = "proteins")
    private double proteins;

    @Column(name = "fats")
    private double fats;

    @Column(name = "carbohydrates")
    private double carbohydrates;

    @Column(name = "mass")
    private int mass;

    @Column(name = "basket_id")
    private int basketId;

    public Food() {}

    public Food(String name, int calories, double proteins, double fats, double carbohydrates, int mass) {
        this.name = name;
        this.calories = calories;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.mass = mass;
    }
}

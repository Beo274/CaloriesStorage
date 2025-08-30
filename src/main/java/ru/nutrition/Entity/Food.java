package ru.nutrition.Entity;

import lombok.Data;

@Data
public class Food {
    private String name;

    private int calories;

    private double proteins;

    private double fats;

    private double carbohydrates;

    private int mass;

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

package ru.nutrition.Entity;

import lombok.Data;

@Data
public class Vegetable extends Food {
    private double fiber;

    public Vegetable(String name, int calories, double proteins, double fats, double carbohydrates, int mass, double fiber) {
        super(name, calories, proteins, fats, carbohydrates, mass);
        this.fiber = fiber;
    }
}

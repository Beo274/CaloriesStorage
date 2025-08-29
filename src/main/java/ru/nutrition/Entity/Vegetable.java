package ru.nutrition.Entity;


public class Vegetable extends Food {
    private double fiber;

    public Vegetable(String name, int calories, double proteins, double fats, double carbohydrates, double fiber) {
        super(name, calories, proteins, fats, carbohydrates);
        this.fiber = fiber;
    }
}

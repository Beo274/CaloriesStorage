package ru;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.Data;
import ru.nutrition.Entity.Food;

import java.util.ArrayList;
import java.util.List;

@Data
@MappedSuperclass
public class MealManager<T extends Food> {
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "basket_id")
    private List<T> meal;

    public MealManager() {
        this.meal = new ArrayList<T>();
    }

    public List<T> getMeal() {
        return meal;
    }
}

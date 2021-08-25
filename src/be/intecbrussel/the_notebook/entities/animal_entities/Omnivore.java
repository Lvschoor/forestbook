package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {

    private Set<Plant> plantDiet;
    private double maxFoodSize;


    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<String> getPlantDiet() {
        Set<String> dietSet = new HashSet<>();
        for (Plant p : plantDiet) {
            dietSet.add(p.getName());
        }
        return dietSet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Animal: " + getName() + " (height: " + getHeight()
                + "cm; length: " + getLength() + "cm; weight: " + getWeight()
                + "kg) of type omnivore with maximum food size " + getMaxFoodSize() + "cm" + " and plant diet " + getPlantDiet();
    }
}

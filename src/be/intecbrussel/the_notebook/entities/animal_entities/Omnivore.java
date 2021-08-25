package be.intecbrussel.the_notebook.entities.animal_entities;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import java.util.HashSet;
import java.util.Set;

//Omnivore class built according give UML
public class Omnivore extends Animal {

    private Set<Plant> plantDiet;
    private double maxFoodSize;

// Unused constructor but in line with given UML
    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

// getPlantDiet returns a Set with the names of the plants that form the diet
    public Set<String> getPlantDiet() {
        Set<String> dietSet = new HashSet<>();
        for (Plant p : plantDiet) {
            dietSet.add(p.getName());
        }
        return dietSet;
    }

// define the plantDiet based on a Set of plants
    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

// add a plant to the existing Set of plants of the plantDiet
    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

// customized toString
    @Override
    public String toString() {
        return "Animal: " + getName() + " (height: " + getHeight()
                + "cm; length: " + getLength() + "cm; weight: " + getWeight()
                + "kg) of type omnivore with maximum food size " + getMaxFoodSize() + "cm" + " and plant diet " + getPlantDiet();
    }
}

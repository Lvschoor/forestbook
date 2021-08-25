package be.intecbrussel.the_notebook.entities.animal_entities;

// Carnivore class built according given UML
public class Carnivore extends Animal {
    private double maxFoodSize;

// Unused constructor but in line with given UML
    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

// customized toString
    @Override
    public String toString() {
        return "Animal: " + getName() + " (height: " + getHeight()
                + "cm; length: " + getLength() + "cm; weight: " + getWeight()
                + "kg) of type carnivore with maximum food size " + getMaxFoodSize() + "cm";
    }
}

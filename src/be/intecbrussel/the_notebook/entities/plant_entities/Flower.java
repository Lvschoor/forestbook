package be.intecbrussel.the_notebook.entities.plant_entities;

// Flower class built according given UML
public class Flower extends Plant {

    private Scent smell;

// Unused constructor but in line with given UML
    public Flower(String name) {
        super(name);
    }

    public Flower(String name, double height) {
        super(name, height);
    }

    public Scent getSmell() {
        return smell;
    }

    public void setSmell(Scent smell) {
        this.smell = smell;
    }

// customized toString
    @Override
    public String toString() {
        return "Plant: " + getName() + " (height: " + getHeight() + "m) of type flower with scent " + getSmell();
    }
}

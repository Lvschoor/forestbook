package be.intecbrussel.the_notebook.entities.plant_entities;

// Weed class built according given UML
public class Weed extends Plant {

    private double area;

// Unused constructor but in line with given UML
    public Weed(String name) {
        super(name);
    }

    public Weed(String name, double height) {
        super(name, height);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

// customized toString
    @Override
    public String toString() {
        return "Plant: " + getName() + " (height: " + getHeight() + "m) of type weed and covered area " + getArea() + "m\u00b2";

    }
}

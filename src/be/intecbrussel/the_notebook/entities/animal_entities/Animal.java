package be.intecbrussel.the_notebook.entities.animal_entities;

// Animal class built according given UML
public class Animal {
    private String name;
    private double weight;
    private double height;
    private double length;

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        setWeight(weight);
        setHeight(height);
        setLength(length);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }


}

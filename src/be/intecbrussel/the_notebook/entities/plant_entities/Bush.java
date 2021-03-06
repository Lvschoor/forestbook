package be.intecbrussel.the_notebook.entities.plant_entities;

// Bush class built according given UML
public class Bush extends Plant {

    private String fruit;
    private LeafType leafType;

// Unused constructor but in line with given UML
    public Bush(String name) {
        super(name);
    }

    public Bush(String name, double height) {
        super(name, height);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }


// customized toString
    @Override
    public String toString() {
        return "Plant: " + getName() + " (height: " + getHeight() + "m) of type bush with leaf type " + getLeafType() + " and fruit " + getFruit();
    }
}

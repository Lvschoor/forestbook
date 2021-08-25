package be.intecbrussel.the_notebook.entities.plant_entities;

// Tree class built according given UML
public class Tree extends Plant {
    private LeafType leafType;

// Unused constructor but in line with given UML
    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
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
        return "Plant: " + getName() + " (height: " + getHeight() + "m) of type tree with leaf type " + getLeafType();
    }
}

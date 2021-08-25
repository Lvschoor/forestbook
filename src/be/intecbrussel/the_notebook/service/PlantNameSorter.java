package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import java.util.Comparator;

//Comparator that compares the names of the plants

public class PlantNameSorter implements Comparator<Plant> {
    @Override
    public int compare(Plant p1, Plant p2) {
        return p1.getName().compareTo(p2.getName());
    }
}


package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.plant_entities.Plant;
import java.util.Comparator;

//Comparator that compares the heights of the plants

public class PlantHeightSorter implements Comparator<Plant> {
    @Override
    public int compare(Plant p1, Plant p2) {
        return Double.compare(p1.getHeight(), p2.getHeight());
    }
}

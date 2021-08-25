package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.Animal;
import java.util.Comparator;

//Comparator that compares the heights of the animals

public class AnimalHeightSorter implements Comparator<Animal> {
    @Override
    public int compare(Animal a1, Animal a2) {
        return Double.compare(a1.getHeight(), a2.getHeight());
    }
}

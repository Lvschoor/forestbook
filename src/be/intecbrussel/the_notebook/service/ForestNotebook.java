package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// ForestNotebook class built according given UML
public class ForestNotebook {

    private List<Carnivore> carnivores = new ArrayList<>();
    private List<Omnivore> omnivores = new ArrayList<>();
    private List<Herbivore> herbivores = new ArrayList<>();
    private int plantCount = 0;
    private int animalCount = 0;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants = new ArrayList<>();

    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public void setPlantCount(int plantCount) {
        this.plantCount = plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

// adding an animal to the animals list only if this animal is not yet observed
// also adding it to the correct subgroup and counting the animals added
    public void addAnimal(Animal animal) {
        boolean alreadyObserved = false;
        for (Animal a : animals) {
            if (animal.getName().equals(a.getName())) {
                alreadyObserved = true;
                break;
            }
        }
        if (alreadyObserved) {
            System.out.println("Animal already registered");
        } else {
            animals.add(animal);
            if (animal instanceof Carnivore) {
                carnivores.add((Carnivore) animal);
            }
            if (animal instanceof Herbivore) {
                herbivores.add((Herbivore) animal);
            }
            if (animal instanceof Omnivore) {
                omnivores.add((Omnivore) animal);
            }
            animalCount++;
        }
    }

// adding a plant to the list only if this plant has not yet been observed and counting the number of plants added
    public void addPlant(Plant plant) {
        boolean alreadyObserved = false;
        for (Plant p : plants) {
            if (plant.getName().equals(p.getName())) {
                alreadyObserved = true;
                break;
            }
        }
        if (alreadyObserved) {
            System.out.println("Plant already registered");
        } else {
            plants.add(plant);
            plantCount++;
        }
    }

// loop through both lists and print aal plants and animals to console
    public void printNotebook() {
        for (Plant plant : plants) {
            System.out.println(plant);
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

// sorting all the lists with the respective criteria
    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName));
    }

    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
    }
}

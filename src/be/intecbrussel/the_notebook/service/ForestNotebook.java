package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.entities.animal_entities.*;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


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

    public void addAnimal(Animal animal) {
        if (animals.contains(animal)) {
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

    public void addPlant(Plant plant) {
        if (plants.contains(plant)) {
            System.out.println("Plant already registered");
        } else {
            plants.add(plant);
            plantCount++;
        }


    }

    public void printNotebook() {

        for (Plant plant : plants) {
            System.out.println(plant);
        }
        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }

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
